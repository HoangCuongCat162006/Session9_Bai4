# Phân tích: Sự khác biệt cấu hình Logback giữa Dev và Prod

- Môi trường Dev:
    - In log ra Console để developer dễ theo dõi khi debug.
    - Dùng mức DEBUG để hiển thị chi tiết log.

- Môi trường Prod:
    - Lưu log ra file (app.log) thay vì console.
    - Dùng RollingFileAppender để tự động cắt file khi vượt 10MB và giữ tối đa 30 ngày.
    - Dùng mức INFO để tránh log rác, chỉ ghi log quan trọng.