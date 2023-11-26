package h_Patron_Decorator_Guerrero;

/**
 * Implementación concreta del componente base que representa un personaje.
 */
class BasicCharacter implements Character {
    private String name;

    public BasicCharacter(String name) {
        this.name = name;
    }

    @Override
    public void equip() {
        System.out.println(name + " equipado con ropa básica.");
    }
}
