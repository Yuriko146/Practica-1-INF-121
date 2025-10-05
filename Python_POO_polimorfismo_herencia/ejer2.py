class Bus:
    COSTO_PASAJE = 1.50
    
    def __init__(self, capacidad):
        self.capacidad_total = capacidad
        self.pasajeros_actuales = 0
        self.dinero_recaudado = 0.0
    
    # a) Subir pasajeros
    def subir_pasajeros(self, cantidad):
        disponibles = self.capacidad_total - self.pasajeros_actuales
        if cantidad <= disponibles:
            self.pasajeros_actuales += cantidad
            print(f"{cantidad} pasajeros subieron. Total: {self.pasajeros_actuales}")
            return True
        else:
            print(f"No hay espacio. Disponibles: {disponibles}")
            return False
    
    # b) Cobrar pasaje
    def cobrar_pasaje(self, numero_pasajeros):
        total = numero_pasajeros * self.COSTO_PASAJE
        self.dinero_recaudado += total
        print(f"Cobrado a {numero_pasajeros} pasajeros: Bs. {total:.2f}")
        return total
    
    # c) Mostrar asientos disponibles
    def mostrar_asientos_disponibles(self):
        disponibles = self.capacidad_total - self.pasajeros_actuales
        print(f"\n{'='*35}")
        print(f"Asientos disponibles: {disponibles}")
        print(f"Pasajeros actuales: {self.pasajeros_actuales}/{self.capacidad_total}")
        print(f"{'='*35}\n")


# d) Ejemplo de uso
if __name__ == "__main__":
    print("=== SISTEMA DE GESTIÓN DE BUS ===\n")
    
    # Crear bus con capacidad de 40
    mi_bus = Bus(40)
    
    # Subir 15 pasajeros y cobrar
    print("--- Primer grupo ---")
    mi_bus.subir_pasajeros(15)
    mi_bus.cobrar_pasaje(15)
    mi_bus.mostrar_asientos_disponibles()
    
    # Subir 20 pasajeros más y cobrar
    print("--- Segundo grupo ---")
    mi_bus.subir_pasajeros(20)
    mi_bus.cobrar_pasaje(20)
    mi_bus.mostrar_asientos_disponibles()
    
    # Intentar subir más de los que caben
    print("--- Intentando subir 10 más ---")
    mi_bus.subir_pasajeros(10)
    
    print(f"\n💰 Dinero total recaudado: Bs. {mi_bus.dinero_recaudado:.2f}")