-- Create the database
CREATE DATABASE IF NOT EXISTS parcelmanagement;
USE parcelmanagement;

-- User Login Table
CREATE TABLE IF NOT EXISTS userlogin (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100) UNIQUE,
    password VARCHAR(255),
    phone VARCHAR(20),
    address TEXT
);

-- Rider Login Table
CREATE TABLE IF NOT EXISTS riderlogin (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100) UNIQUE,
    password VARCHAR(255),
    phone VARCHAR(20),
    status VARCHAR(50) DEFAULT 'available'
);

-- Parcels Table
CREATE TABLE IF NOT EXISTS parcels (
    id INT AUTO_INCREMENT PRIMARY KEY,
    sender_email VARCHAR(100),
    receiver_name VARCHAR(100),
    receiver_phone VARCHAR(20),
    receiver_address TEXT,
    weight DOUBLE,
    status VARCHAR(50),
    sent_at DATETIME DEFAULT CURRENT_TIMESTAMP
);

-- Assigned Parcels Table
CREATE TABLE IF NOT EXISTS assignedparcels (
    id INT AUTO_INCREMENT PRIMARY KEY,
    parcel_id INT,
    rider_email VARCHAR(100),
    assigned_at DATETIME DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (parcel_id) REFERENCES parcels(id)
);

-- Sample Data
INSERT INTO userlogin (name, email, password, phone, address) VALUES
('Ali Khan', 'ali@example.com', 'user123', '03111222333', 'Lahore'),
('Zara Malik', 'zara@example.com', 'pass456', '03222333444', 'Karachi');

INSERT INTO riderlogin (name, email, password, phone) VALUES
('Rider A', 'riderA@example.com', 'riderpass', '03001112222'),
('Rider B', 'riderB@example.com', 'rider456', '03003334444');

INSERT INTO parcels (sender_email, receiver_name, receiver_phone, receiver_address, weight, status)
VALUES ('ali@example.com', 'Ahmed Raza', '03445556666', 'Islamabad', 2.5, 'In Transit');

INSERT INTO assignedparcels (parcel_id, rider_email) VALUES
(1, 'riderA@example.com');
