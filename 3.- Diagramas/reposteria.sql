-- MySQL Script generated by MySQL Workbench
-- 11/27/14 17:38:57
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema poscakeapp
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema poscakeapp
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `poscakeapp` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `poscakeapp` ;

-- -----------------------------------------------------
-- Table `poscakeapp`.`Categoria`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `poscakeapp`.`Categoria` (
  `idCategoria` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  `descripcion` VARCHAR(45) NULL,
  `elimiando` TINYINT(1) NULL DEFAULT 0,
  PRIMARY KEY (`idCategoria`),
  UNIQUE INDEX `idCategoria_UNIQUE` (`idCategoria` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `poscakeapp`.`Empresa`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `poscakeapp`.`Empresa` (
  `idEmpresa` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(25) NOT NULL,
  `calle` VARCHAR(45) NULL,
  `numInt` INT NULL,
  `numExt` INT NULL,
  `ciudad` VARCHAR(20) NULL,
  `colonia` VARCHAR(20) NULL,
  `estado` VARCHAR(25) NULL,
  `codigoPostal` INT NULL,
  `RFC` VARCHAR(15) NOT NULL,
  `pagWeb` VARCHAR(250) NULL,
  `email` VARCHAR(45) NULL,
  `eliminado` TINYINT(1) NULL DEFAULT 0,
  PRIMARY KEY (`idEmpresa`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `poscakeapp`.`Producto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `poscakeapp`.`Producto` (
  `idProducto` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `descripcion` VARCHAR(250) NOT NULL,
  `linkFoto` VARCHAR(250) NULL,
  `kilos` INT NOT NULL,
  `numPersonas` INT NOT NULL,
  `precioUnitario` DECIMAL(8,2) NOT NULL,
  `eliminado` TINYINT(1) NULL DEFAULT 0,
  `Categoria_idCategoria` INT NOT NULL,
  `Empresa_idEmpresa` INT NOT NULL,
  PRIMARY KEY (`idProducto`, `Categoria_idCategoria`, `Empresa_idEmpresa`),
  INDEX `fk_Producto_Categoria1_idx` (`Categoria_idCategoria` ASC),
  UNIQUE INDEX `idProducto_UNIQUE` (`idProducto` ASC),
  INDEX `fk_Producto_Empresa1_idx` (`Empresa_idEmpresa` ASC),
  CONSTRAINT `fk_Producto_Categoria1`
    FOREIGN KEY (`Categoria_idCategoria`)
    REFERENCES `poscakeapp`.`Categoria` (`idCategoria`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Producto_Empresa1`
    FOREIGN KEY (`Empresa_idEmpresa`)
    REFERENCES `poscakeapp`.`Empresa` (`idEmpresa`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `poscakeapp`.`Proveedor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `poscakeapp`.`Proveedor` (
  `idProveedor` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(25) NOT NULL,
  `aPaterno` VARCHAR(20) NOT NULL,
  `aMaterno` VARCHAR(20) NULL,
  `marca` VARCHAR(20) NOT NULL,
  `empresa` VARCHAR(25) NOT NULL,
  `RFC` VARCHAR(15) NULL,
  `telFijo` VARCHAR(12) NULL,
  `telCel` VARCHAR(12) NOT NULL,
  `calle` VARCHAR(45) NULL,
  `numInt` INT NULL,
  `numExt` INT NULL,
  `colonia` VARCHAR(20) NULL,
  `ciudad` VARCHAR(20) NULL,
  `estado` VARCHAR(25) NULL,
  `codigoPostal` INT NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `eliminado` TINYINT(1) NULL DEFAULT 0,
  PRIMARY KEY (`idProveedor`),
  UNIQUE INDEX `idProveedor_UNIQUE` (`idProveedor` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `poscakeapp`.`Insumo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `poscakeapp`.`Insumo` (
  `idInsumo` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `unidadExistencia` INT NOT NULL DEFAULT 0,
  `tipoUnidad` VARCHAR(10) NOT NULL DEFAULT 'grs',
  `minStock` INT NOT NULL DEFAULT 0,
  `maxStock` INT NOT NULL DEFAULT 0,
  `precioUnidad` DECIMAL(8,2) NOT NULL DEFAULT 0.0,
  `eliminado` TINYINT(1) NULL DEFAULT 0,
  `Proveedor_idProveedor` INT NOT NULL,
  PRIMARY KEY (`idInsumo`, `Proveedor_idProveedor`),
  UNIQUE INDEX `idInsumo_UNIQUE` (`idInsumo` ASC),
  INDEX `fk_Insumo_Proveedor1_idx` (`Proveedor_idProveedor` ASC),
  CONSTRAINT `fk_Insumo_Proveedor1`
    FOREIGN KEY (`Proveedor_idProveedor`)
    REFERENCES `poscakeapp`.`Proveedor` (`idProveedor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `poscakeapp`.`Insumo_has_Producto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `poscakeapp`.`Insumo_has_Producto` (
  `Producto_idProducto` INT NOT NULL,
  `Insumo_idInsumo` INT NOT NULL,
  PRIMARY KEY (`Producto_idProducto`, `Insumo_idInsumo`),
  INDEX `fk_Insumo_has_Producto_Producto1_idx` (`Producto_idProducto` ASC),
  INDEX `fk_Insumo_has_Producto_Insumo1_idx` (`Insumo_idInsumo` ASC),
  CONSTRAINT `fk_Insumo_has_Producto_Insumo1`
    FOREIGN KEY (`Insumo_idInsumo`)
    REFERENCES `poscakeapp`.`Insumo` (`idInsumo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Insumo_has_Producto_Producto1`
    FOREIGN KEY (`Producto_idProducto`)
    REFERENCES `poscakeapp`.`Producto` (`idProducto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `poscakeapp`.`Usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `poscakeapp`.`Usuario` (
  `idusuario` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(25) NOT NULL,
  `aPaterno` VARCHAR(20) NULL,
  `aMaterno` VARCHAR(20) NULL,
  `username` VARCHAR(25) NOT NULL,
  `password` VARCHAR(16) NOT NULL,
  `tipo` INT NOT NULL DEFAULT 2,
  `eliminado` TINYINT(1) NULL DEFAULT 0,
  `Empresa_idEmpresa` INT NOT NULL,
  PRIMARY KEY (`idusuario`, `Empresa_idEmpresa`),
  UNIQUE INDEX `username_UNIQUE` (`username` ASC),
  INDEX `fk_Usuario_Empresa1_idx` (`Empresa_idEmpresa` ASC),
  CONSTRAINT `fk_Usuario_Empresa1`
    FOREIGN KEY (`Empresa_idEmpresa`)
    REFERENCES `poscakeapp`.`Empresa` (`idEmpresa`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `poscakeapp`.`Cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `poscakeapp`.`Cliente` (
  `idCliente` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(25) NOT NULL,
  `aPaterno` VARCHAR(20) NOT NULL,
  `aMaterno` VARCHAR(20) NULL,
  `RFC` VARCHAR(15) NULL,
  `telFijo` VARCHAR(12) NULL,
  `telCel` VARCHAR(12) NOT NULL,
  `calle` VARCHAR(45) NULL,
  `numInt` INT NULL,
  `numExt` INT NULL,
  `colonia` VARCHAR(20) NULL,
  `ciudad` VARCHAR(20) NULL,
  `estado` VARCHAR(25) NULL,
  `codigoPostal` INT NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `eliminado` TINYINT(1) NULL DEFAULT 0,
  PRIMARY KEY (`idCliente`),
  UNIQUE INDEX `idProveedor_UNIQUE` (`idCliente` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `poscakeapp`.`ventaPedido`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `poscakeapp`.`ventaPedido` (
  `idventaPedido` INT NOT NULL AUTO_INCREMENT,
  `abono` DECIMAL(8,2) NOT NULL,
  `resto` DECIMAL(8,2) NOT NULL,
  `entregado` TINYINT(1) NOT NULL DEFAULT 0,
  `descripcion` VARCHAR(250) NULL,
  PRIMARY KEY (`idventaPedido`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `poscakeapp`.`Venta`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `poscakeapp`.`Venta` (
  `idVenta` INT NOT NULL AUTO_INCREMENT,
  `tipoVenta` INT NOT NULL DEFAULT 1,
  `fechaVenta` DATETIME NOT NULL,
  `fechaEntrega` DATETIME NULL,
  `kilos` INT NOT NULL,
  `precioTotal` DECIMAL(8,2) NOT NULL,
  `eliminado` TINYINT(1) NULL DEFAULT 0,
  `Producto_idProducto` INT NOT NULL,
  `usuario_idusuario` INT NOT NULL,
  `Cliente_idCliente` INT NOT NULL,
  `ventaPedido_idventaPedido` INT NOT NULL,
  PRIMARY KEY (`idVenta`, `Producto_idProducto`, `usuario_idusuario`, `Cliente_idCliente`, `ventaPedido_idventaPedido`),
  INDEX `fk_Venta_Producto1_idx` (`Producto_idProducto` ASC),
  INDEX `fk_Venta_usuario1_idx` (`usuario_idusuario` ASC),
  INDEX `fk_Venta_Cliente1_idx` (`Cliente_idCliente` ASC),
  UNIQUE INDEX `idVenta_UNIQUE` (`idVenta` ASC),
  INDEX `fk_Venta_ventaPedido1_idx` (`ventaPedido_idventaPedido` ASC),
  CONSTRAINT `fk_Venta_Producto1`
    FOREIGN KEY (`Producto_idProducto`)
    REFERENCES `poscakeapp`.`Producto` (`idProducto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Venta_usuario1`
    FOREIGN KEY (`usuario_idusuario`)
    REFERENCES `poscakeapp`.`Usuario` (`idusuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Venta_Cliente1`
    FOREIGN KEY (`Cliente_idCliente`)
    REFERENCES `poscakeapp`.`Cliente` (`idCliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Venta_ventaPedido1`
    FOREIGN KEY (`ventaPedido_idventaPedido`)
    REFERENCES `poscakeapp`.`ventaPedido` (`idventaPedido`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
