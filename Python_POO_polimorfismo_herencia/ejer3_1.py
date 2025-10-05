class Matriz:
    TAMANO = 10
    
    def __init__(self, matriz=None):
        """Constructor a) y b) combinados"""
        if matriz is None:
            # Matriz identidad por defecto
            self.matriz = [[1.0 if i == j else 0.0 for j in range(self.TAMANO)] 
                          for i in range(self.TAMANO)]
        else:
            # Matriz con valores dados
            self.matriz = [fila[:] for fila in matriz]
    
    def sumar(self, matriz):
        """Método c) - Sumar matrices"""
        resultado = [[self.matriz[i][j] + matriz.matriz[i][j] 
                     for j in range(self.TAMANO)] 
                    for i in range(self.TAMANO)]
        return Matriz(resultado)
    
    def restar(self, matriz):
        """Método c) - Restar matrices"""
        resultado = [[self.matriz[i][j] - matriz.matriz[i][j] 
                     for j in range(self.TAMANO)] 
                    for i in range(self.TAMANO)]
        return Matriz(resultado)
    
    def igual(self, matriz):
        """Método d) - Comparar matrices"""
        return all(self.matriz[i][j] == matriz.matriz[i][j] 
                  for i in range(self.TAMANO) 
                  for j in range(self.TAMANO))
    
    def imprimir(self):
        """Método auxiliar para imprimir"""
        for fila in self.matriz:
            print(' '.join(f'{val:6.2f}' for val in fila))


# Ejemplo de uso
if __name__ == "__main__":
    m1 = Matriz()  # Matriz identidad
    print("Matriz identidad:")
    m1.imprimir()
    
    valores = [[i + j for j in range(10)] for i in range(10)]
    m2 = Matriz(valores)
    print("\nMatriz con valores:")
    m2.imprimir()
    
    m3 = m1.sumar(m2)
    print("\nSuma:")
    m3.imprimir()