package org.example.session9_bai4.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class InventoryService {

    /**
     * Hàm cập nhật kho - Dùng chung cho Bài 3 và Bài 4
     */
    public void updateStock(String productId, int qty) {
        log.info("Bắt đầu cập nhật kho cho SP: {}, SL: {}", productId, qty);

        if (qty < 0) {
            log.warn("Cảnh báo: Số lượng không hợp lệ: {}", qty);
        } else {
            log.info("Cập nhật kho thành công cho sản phẩm: {}", productId);
        }
    }
}
