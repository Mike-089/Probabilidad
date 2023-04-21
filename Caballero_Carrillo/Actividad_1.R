# Definir el conjunto de elementos
vocales <- c("a", "e", "i", "o", "u")
numeros <- 1:9

opcion <- readline("Introduce 'P' para permutaciones o 'C' para combinaciones: ")

switch(opcion,
       "P" = {
         # Calcular y mostrar el número de permutaciones
         inicio <- Sys.time()
         num_permutaciones_vocales <- factorial(length(vocales)) / factorial(length(vocales) - 2)
         cat("El número de permutaciones de 2 elementos de las vocales es:", num_permutaciones_vocales, "\n")
         
         num_permutaciones_numeros <- factorial(length(numeros)) / factorial(length(numeros) - 2)
         cat("El número de permutaciones de 2 elementos de los números es:", num_permutaciones_numeros, "\n")
         fin <- Sys.time()
         cat("Tiempo de ejecución para las permutaciones:", as.numeric(difftime(fin, inicio, units="secs"))*1000, "milisegundos\n")
       },
       "C" = {
         # Calcular y mostrar el número de combinaciones
         inicio <- Sys.time()
         num_combinaciones_vocales <- factorial(length(vocales)) / (factorial(2) * factorial(length(vocales) - 2))
         cat("El número de combinaciones de 2 elementos de las vocales es:", num_combinaciones_vocales, "\n")
         
         num_combinaciones_numeros <- factorial(length(numeros)) / (factorial(2) * factorial(length(numeros) - 2))
         cat("El número de combinaciones de 2 elementos de los números es:", num_combinaciones_numeros, "\n")
         fin <- Sys.time()
         cat("Tiempo de ejecución para las combinaciones:", as.numeric(difftime(fin, inicio, units="secs"))*1000, "milisegundos\n")
       },
       stop("Opción inválida")
)

