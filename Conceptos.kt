fun main() {
    // Constante con val
    val nombre: String = "María"
    
    // Print del valor de la constante
    println("Nombre: $nombre")
    
    println("------------")
    
    // Variable con var
    var edad: Int = 25
    
    // Print del valor de la variable
    println("Edad: $edad")
    
    // Cambio en el valor de la variable
    edad = 26
    
    // Print del nuevo valor de la variable
    println("Edad actualizada: $edad")
    
    println("------------")
    
    // Variable opcional (nullable)
    var direccion: String? = null
    
    // Modificación de la variable opcional
    direccion = "456 Avenida Principal"
    
    // Acceso seguro a un valor opcional
    println("Dirección: ${direccion ?: "Dirección desconocida"}")
}