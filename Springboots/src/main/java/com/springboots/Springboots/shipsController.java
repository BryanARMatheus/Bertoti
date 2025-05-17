package com.springboots.Springboots;

import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://127.0.0.1:5500")
@RestController
@RequestMapping("/ships")
public class shipsController {
    private final List<Ship> ships = new ArrayList<>();


    @PostConstruct
    public void init() {
        ships.add(new Ship("1", "Bismark", "KMS","1939"));
        ships.add(new Ship("2", "New Jersey", "USS","1939"));

    }

    @GetMapping
    Iterable<Ship> getShips() {
        return ships;
    }

    @GetMapping("/{id}")
    Optional<Ship> getShipById(@PathVariable String id) {
        for (Ship c: ships) {
            if (c.getId().equals(id)) {
                return Optional.of(c);
            }
        }

        return Optional.empty();
    }

    @PostMapping
    public Ship postShip(@RequestBody Ship Ship) {
        ships.add(Ship);
        return Ship;
    }

    @PutMapping("/{id}")
    ResponseEntity<Ship> putShip(@PathVariable String id,
                                 @RequestBody Ship updatedShip) {
        int ShipIndex = -1;

        for (int i = 0; i < ships.size(); i++) {
            if (ships.get(i).getId().equals(id)) {
                ships.set(i, updatedShip);
                return ResponseEntity.ok(updatedShip);
            }
        }

        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    void deleteShip(@PathVariable String id) {
        ships.removeIf(c -> c.getId().equals(id));
    }
}
