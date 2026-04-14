public static void mostrarTodosLosVehiculos(List<Vehiculo> vehiculos) {
    System.out.println("\n===============================================");
    System.out.println("       LISTADO COMPLETO DE VEHÍCULOS");
    System.out.println("===============================================");

    if (vehiculos.isEmpty()) {
        System.out.println("No hay vehículos registrados en el sistema.");
    } else {
        for (Vehiculo v : vehiculos) {
            // Polimorfismo en acción:
            // Si 'v' es un Camion, llamará al mostrarDetalle() de Camion.
            // Si 'v' es una Moto, llamará al de Moto.
            v.mostrarDetalle();
        }
    }
    System.out.println("===============================================\n");
}