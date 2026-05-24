# Phân tích: Sự khác biệt cấu hình Logback giữa Dev và Prod

- Môi trường Dev:
  - In log ra Console để dễ debug.
  - Dùng mức DEBUG để xem chi tiết.

- Môi trường Prod:
  - Lưu log ra file (app.log).
  - Tự động cắt file khi vượt 10MB, giữ tối đa 30 ngày.
  - Dùng mức INFO để tránh log rác.