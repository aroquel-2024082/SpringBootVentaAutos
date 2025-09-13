drop database if exists DBProyectoAutomotriz;
create database DBProyectoAutomotriz;
use DBProyectoAutomotriz;

create table clientes (
    id_cliente int not null auto_increment,
    nombre_cliente varchar(100),
    apellido_cliente varchar(100),
    email_cliente varchar(100) unique,
    telefono_cliente varchar(15),
    primary key PK_id_cliente(id_cliente)
);

create table proveedores (
    id_proveedor int not null auto_increment,
    nombre_proveedor varchar(100),
    contacto_proveedor varchar(100),
    primary key PK_id_proveedor(id_proveedor)
);

create table repuestos (
    id_repuesto int not null auto_increment,
    nombre_repuesto varchar(50),
    anio_repuesto varchar(50),
    color_repuesto varchar(30),
    precio_repuesto varchar(50),
    estado_repuesto varchar(20),
    primary key PK_id_repuesto(id_repuesto)
);

create table ventas (
    id_venta int not null auto_increment,
    id_cliente int not null,
    id_repuesto int not null,
    fecha_venta varchar(50),
    precio_venta varchar(50),
    primary key PK_id_venta(id_venta),
    constraint FK_cliente foreign key (id_cliente) references Clientes(id_cliente) on delete cascade,
    constraint FK_repuesto foreign key (id_repuesto) references repuestos(id_repuesto) on delete cascade
);

DELIMITER $$
CREATE PROCEDURE sp_AgregarCliente(
    IN c_nombre VARCHAR(100),
    IN c_apellido VARCHAR(100),
    IN c_email VARCHAR(100),
    IN c_telefono VARCHAR(15)
)
BEGIN
    INSERT INTO clientes (nombre_cliente, apellido_cliente, email_cliente, telefono_cliente)
    VALUES (c_nombre, c_apellido, c_email, c_telefono);
END$$
DELIMITER ;

CALL sp_AgregarCliente('Giuseppe', 'Rossi', 'giusepperossi@gmail.com', '7598-8765');
CALL sp_AgregarCliente('Isabella', 'Conti', 'isabellaconti@gmail.com', '2543-4321');
CALL sp_AgregarCliente('Matteo', 'Rizzo', 'matteorizzo@gmail.com', '0201-9876');
CALL sp_AgregarCliente('Valentina', 'Lombardi', 'valentinalombardi@gmail.com', '8796-2345');
CALL sp_AgregarCliente('Alessandro', 'Galli', 'alessandrogalli@gmail.com', '3657-6789');
CALL sp_AgregarCliente('Diego', 'Garcia', 'diegogarcia@gmail.com', '7854-1212');
CALL sp_AgregarCliente('Sofia', 'Fernandez', 'sofiafernandez@gmail.com', '1203-3434');
CALL sp_AgregarCliente('Ricardo', 'Perez', 'ricardoperez@gmail.com', '9876-5656');
CALL sp_AgregarCliente('Valeria', 'Lopez', 'valerialopez@gmail.com', '2154-7878');
CALL sp_AgregarCliente('Emilio', 'Sanchez', 'emiliosanchez@gmail.com', '2021-9090');

DELIMITER $$
CREATE PROCEDURE sp_AgregarProveedor(
    IN p_nombre VARCHAR(100),
    IN p_contacto VARCHAR(100)
)
BEGIN
    INSERT INTO proveedores (nombre_proveedor, contacto_proveedor)
    VALUES (p_nombre, p_contacto);
END$$
DELIMITER ;

CALL sp_AgregarProveedor('Toyota', 'Fiore');
CALL sp_AgregarProveedor('Mazda', 'Santos');
CALL sp_AgregarProveedor('Corolla', 'Andre');
CALL sp_AgregarProveedor('Ford', 'Pedro');
CALL sp_AgregarProveedor('Chebrolet', 'Marino');
CALL sp_AgregarProveedor('Lamborgini', 'Hernandez');
CALL sp_AgregarProveedor('Musctang', 'Gomez');
CALL sp_AgregarProveedor('Ferrari', 'Rodriguez');
CALL sp_AgregarProveedor('Fiat', 'PEPE');
CALL sp_AgregarProveedor('Volvo', 'Ronaldo');

DELIMITER $$
CREATE PROCEDURE sp_AgregarRepuesto(
    IN r_nombre VARCHAR(50),
    IN r_anio varchar(50),
    IN r_color VARCHAR(30),
    IN r_precio varchar(50),
    IN r_estado VARCHAR(20)
)
BEGIN
    INSERT INTO repuestos (nombre_repuesto, anio_repuesto, color_repuesto, precio_repuesto, estado_repuesto)
    VALUES (r_nombre, r_anio, r_color, r_precio, r_estado);
END$$
DELIMITER ;

CALL sp_AgregarRepuesto('capo', 2022, 'Rojo', 350000.50, 'vendido');
CALL sp_AgregarRepuesto('bomper', 2023, 'Amarillo', 280000.75, 'apartado');
CALL sp_AgregarRepuesto('frenos', 2024, 'Azul Marino', 85000.25, 'vendido');
CALL sp_AgregarRepuesto('vidrio', 2021, 'Carbono', 2000000.00, 'disponible');
CALL sp_AgregarRepuesto('ventanas', 2023, 'Blanco Perla', 48000.99, 'vendido');
CALL sp_AgregarRepuesto('sillones', 2024, 'Verde Menta', 22000.00, 'disponible');
CALL sp_AgregarRepuesto('puertas', 2023, 'Gris Plomo', 27500.50, 'vendido');
CALL sp_AgregarRepuesto('bateria', 2022, 'Negro', 34500.00, 'disponible');
CALL sp_AgregarRepuesto('motor', 2024, 'Azul Eléctrico', 29000.75, 'vendido');
CALL sp_AgregarRepuesto('llantas', 2023, 'Plata', 31250.00, 'apartado');

DELIMITER $$
CREATE PROCEDURE sp_AgregarVenta(
    IN v_id_cliente INT,
    IN v_id_repuesto INT,
    IN v_fecha_venta varchar(50),
    IN v_precio_venta varchar(50)
)
BEGIN
    INSERT INTO ventas (id_cliente, id_repuesto, fecha_venta, precio_venta)
    VALUES (v_id_cliente, v_id_repuesto, v_fecha_venta, v_precio_venta);
END$$
DELIMITER ;

CALL sp_AgregarVenta(1, 1, '2024-05-15', '354.00');
CALL sp_AgregarVenta(2, 2, '2024-06-01', '278.50');
CALL sp_AgregarVenta(3, 3, '2024-07-20', '8490.25');
CALL sp_AgregarVenta(4, 4, '2024-08-10', '2870.00');
CALL sp_AgregarVenta(5, 5, '2024-09-05', '840.50');
CALL sp_AgregarVenta(6, 6, '2024-04-22', '500.99');
CALL sp_AgregarVenta(7, 7, '2024-03-10', '20.50');
CALL sp_AgregarVenta(8, 8, '2024-02-18', '254.00');
CALL sp_AgregarVenta(9, 9, '2024-01-28', '200.75');
CALL sp_AgregarVenta(10, 10, '2024-02-25', '150.00');

select * from clientes;
select * from proveedores;
select * from repuestos;
select * from ventas;