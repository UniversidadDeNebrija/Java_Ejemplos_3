package h_Patron_Decorator_Guerrero;

/**
 * Decorador concreto que añade una espada al personaje.
 */
class SwordDecorator extends CharacterDecorator {

    public SwordDecorator(Character character) {
        super(character);
    }

    @Override
    public void equip() {
        super.equip();
        System.out.println("Equipado con una espada brillante.");
    }
}
