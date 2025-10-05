class Videojuego:
    def __init__(self, nombre="Sin nombre", plataforma="Sin plataforma", cantidad_jugadores=0):
        self.nombre = nombre
        self.plataforma = plataforma
        self.cantidad_jugadores = cantidad_jugadores

    def agregar_jugadores(self, cantidad=1):
        self.cantidad_jugadores += cantidad
        print(f"Se agregaron {cantidad} jugador(es). Total: {self.cantidad_jugadores}")

    def __str__(self):
        return f"Videojuego: {self.nombre} | Plataforma: {self.plataforma} | Jugadores: {self.cantidad_jugadores}"


# Programa principal
if __name__ == "__main__":
    # Instanciar videojuegos
    juego1 = Videojuego("Minecraft", "PC", 5)
    juego2 = Videojuego("Fortnite")
    
    print("=== VIDEOJUEGOS CREADOS ===")
    print(juego1)
    print(juego2)
    print()
    
    print(f"=== Agregar 1 jugador a {juego1.nombre} ===")
    juego1.agregar_jugadores()
    print()
    
    cantidad = int(input(f"Ingrese cantidad de jugadores a agregar a {juego2.nombre}: "))
    juego2.agregar_jugadores(cantidad)
    print()
    
    print("=== ESTADO FINAL ===")
    print(juego1)
    print(juego2)