# Smart Parcel Management System

A Java Swing-based desktop application for managing parcel deliveries, integrated with a MySQL database.

## 🚀 Features

- Admin & User authentication
- Add, update, delete parcels
- Parcel history & status tracking
- Rider management
- GUI built using Java Swing
- MySQL database with JDBC integration

## 🧰 Tech Stack

- Java (Swing)
- MySQL
- JDBC
- Netbean IDE

## 📷 Screenshots

### Login Pages
![Admin Login](Images/Adminlogin.png)
![User Login](Images/Userlogin.png)

### Dashboard
![User Dashboard](Images/UserDashboard.png)
![Rider Dashboard](Images/RiderDashboard.png)

### Add Parcel Form
![Add Parcel](Images/SendParcel.png)

### SignUp Pages
![Admin SignUp](Images/AdminSignUp.png)
![User SignUp](Images/UserSignUp.png)

## ⚙️ How to Run

1. Clone the repo or download the ZIP.
2. Open in NetBeans or IntelliJ.
3. Import `database.sql` in your MySQL server.
4. Update DB credentials in `DBConnection.java`.
5. Run `Main.java`.

## 🗃️ Database
To set up the database for this project, follow these steps:

1. **Run the SQL script** `database.sql` to create the required tables in your MySQL server.
2. **Configure database credentials** in the `DBConnection.java` file (update MySQL username, password, and database name).

## Running the Project
1. Compile and run the Java project using your favorite IDE (NetBeans, IntelliJ, etc.).
2. Make sure your MySQL server is running.
3. The app should allow users to add, track, and manage parcels.

## 📝 License

MIT License
