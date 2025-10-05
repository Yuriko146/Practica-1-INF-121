class Producto:
    # a) Atributos
    def __init__(self, nombre, precio, stock_inicial):
        self.nombre = nombre
        self.precio = precio
        self.stock = stock_inicial
    
    # b) Método vender (resta del stock)
    def vender(self, cantidad):
        if cantidad <= self.stock:
            self.stock -= cantidad
            total = cantidad * self.precio
            print(f"✓ Vendidos {cantidad} {self.nombre}(s)")
            print(f"  Total: Bs. {total:.2f} | Stock: {self.stock}")
            return True
        else:
            print(f"✗ Stock insuficiente. Disponible: {self.stock}")
            return False
    
    # c) Método reabastecer (suma al stock)
    def reabastecer(self, cantidad):
        self.stock += cantidad
        print(f"✓ Reabastecidos {cantidad} {self.nombre}(s)")
        print(f"  Stock actual: {self.stock}")
    
    def mostrar_info(self):
        print(f"\n{'='*40}")
        print(f"Producto: {self.nombre}")
        print(f"Precio: Bs. {self.precio:.2f}")
        print(f"Stock: {self.stock} unidades")
        print(f"{'='*40}\n")


# Ejemplo de uso
if __name__ == "__main__":
    print("=== GESTIÓN DE PRODUCTOS ===\n")
    
    # Crear producto
    laptop = Producto("Laptop HP", 5000.0, 10)
    laptop.mostrar_info()
    
    # Vender 3 unidades
    print("--- Venta 1 ---")
    laptop.vender(3)
    print()
    
    # Vender 5 unidades más
    print("--- Venta 2 ---")
    laptop.vender(5)
    print()
    
    # Intentar vender más del stock disponible
    print("--- Venta 3 ---")
    laptop.vender(5)
    print()
    
    # Reabastecer 15 unidades
    print("--- Reabastecimiento ---")
    laptop.reabastecer(15)
    print()
    
    # Vender después de reabastecer
    print("--- Venta 4 ---")
    laptop.vender(10)
    
    # Info final
    laptop.mostrar_info()