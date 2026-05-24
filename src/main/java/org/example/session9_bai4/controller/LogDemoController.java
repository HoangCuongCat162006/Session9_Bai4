package org.example.session9_bai4.controller;

import org.example.session9_bai4.service.InventoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/logs")
public class LogDemoController {

    private final InventoryService inventoryService;

    public LogDemoController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @GetMapping("/test4")
    public String testBai4() {

        inventoryService.updateStock("SP004", 20);
        inventoryService.updateStock("SP005", 50);
        inventoryService.updateStock("SP006", -10);

        return "Đã test Bài 4";
    }
}