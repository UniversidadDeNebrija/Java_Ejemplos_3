package h_Patron_Decorator_Guerrero;

/**
 * Decorador abstracto que implementa la interfaz Character y contiene una referencia a un objeto Character.
 */
abstract class CharacterDecorator implements Character {
    protected Character character;

    public CharacterDecorator(Character character) {
        this.character = character;
    }

    @Override
    public void equip() {
        character.equip();
    }
}
