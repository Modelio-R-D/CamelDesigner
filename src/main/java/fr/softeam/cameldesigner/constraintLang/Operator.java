package fr.softeam.cameldesigner.constraintLang;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("694a077c-4cbd-4946-8f09-5fb61bef3cd5")
public enum Operator {
    EQUALS ("=="),
    LESS ("<"),
    LESSTHAN ("=<"),
    BIGGERTHAN ("=>"),
    BIGGER (">");

    @objid ("9782ab57-eb1f-4da8-9cb9-a4b499ee5e9b")
    private final String _text;

    @objid ("7bc406e6-a461-47de-8430-6c7427181830")
    Operator(final String text) {
        this._text = text;
    }

/* (non-Javadoc)
     * @see java.lang.Enum#toString()
     */
    @objid ("02a57587-d7ba-43a6-922b-c379091c700a")
    @Override
    public String toString() {
        return _text;
    }

}
