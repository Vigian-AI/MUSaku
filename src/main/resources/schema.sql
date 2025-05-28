CREATE TABLE transaksi (
    id          INT             AUTO_INCREMENT PRIMARY KEY,
    keterangan  VARCHAR(255)    NOT NULL,
    tipe        VARCHAR(50)     NOT NULL,
    nominal     INTEGER         NOT NULL,
    tanggal     TIMESTAMP       DEFAULT CURRENT_TIMESTAMP
);
