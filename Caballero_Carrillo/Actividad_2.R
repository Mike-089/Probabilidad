# Definir n y k

n <- as.numeric(readline("Introduce el numero de datos: "))
108
k <- as.numeric(readline("Introduce el tamaño de los grupos: "))

# Calcular y mostrar el número de permutaciones
inicio <- Sys.time()
num_permutaciones <- factorial(n) / factorial(n - k)
cat("El número de permutaciones de", k, "grupos y", n, "elementos es:", num_permutaciones, "\n")

# Calcular y mostrar el número de combinaciones
num_combinaciones <- factorial(n) / (factorial(k) * factorial(n - k))
cat("El número de combinaciones de", k, "grupos y", n, "elementos es:", num_combinaciones, "\n")
fin <- Sys.time()
cat("Tiempo de ejecución de ejecucion fue de:", difftime(fin, inicio, units="secs")*1000, "milisegundos\n")
