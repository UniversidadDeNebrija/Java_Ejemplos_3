package h_Patron_Decorator_Guerrero;

/**
 * Decorador concreto que añade una armadura al personaje.
 */
class ArmorDecorator extends CharacterDecorator {

    public ArmorDecorator(Character character) {
        super(character);
    }

    @Override
    public void equip() {
        super.equip();
        System.out.println("Equipado con una armadura reluciente.");
    }
}
