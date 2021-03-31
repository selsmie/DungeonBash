package Equipment;

public enum SpellType {
    CALLLIGHTNING(12),
    FIREBALL(18),
    MAGICMISSILE(6),
    ELDRITCHBLAST(87);

    private final int spellDamage;

    SpellType(int spellDamage) {
        this.spellDamage = spellDamage;
    }

    public int getSpellDamage() {
        return this.spellDamage;
    }
}
