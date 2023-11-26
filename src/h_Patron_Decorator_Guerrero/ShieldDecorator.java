package h_Patron_Decorator_Guerrero;

/**
 * Decorador concreto que añade un escudo al personaje.
 */
class ShieldDecorator extends CharacterDecorator {

    public ShieldDecorator(Character character) {
        super(character);
    }

    @Override
    public void equip() {
        super.equip();
        System.out.println("Equipado con un escudo resistente.");
    }
}
