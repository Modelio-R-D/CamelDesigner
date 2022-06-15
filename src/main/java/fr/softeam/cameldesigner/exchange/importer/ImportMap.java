package fr.softeam.cameldesigner.exchange.importer;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import org.eclipse.emf.cdo.CDOObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("4970b2e0-5c04-4d3c-af4a-58f127b37f49")
public class ImportMap {
    @objid ("034701e6-8591-4a22-a63e-ef35db05bfaf")
    private static ImportMap theSingleInstance;

    @objid ("afb95b99-d474-4012-8696-203a38976d19")
    private Map<CDOObject, CamelElement> modelMap;

    @objid ("b844a873-fc30-42b1-9986-64d8385e3fc3")
    public void clear() {
        this.modelMap.clear();
    }

    @objid ("2afaf2b2-7bfd-4bd1-85a9-ab6dd839465c")
    public boolean containsKey(CDOObject key) {
        return  this.modelMap.containsKey(key);
    }

    @objid ("9bf5a1a5-483b-4a51-9663-a851c4e023de")
    public boolean containsValue(ModelElement val) {
        return  this.modelMap.containsValue(val);
    }

    @objid ("9199c2d1-4bc4-4fe7-82b7-ce28b07c24a3")
    public CamelElement get(CDOObject key) {
        return  this.modelMap.get(key);
    }

    @objid ("4b1be0ad-b044-4e8e-926d-9e5bed8b640b")
    public static ImportMap getInstance() {
        if (theSingleInstance == null)
            theSingleInstance = new ImportMap();
        return theSingleInstance;
    }

    @objid ("4579a65e-1a8e-4dd1-ab07-cbaf19695cd4")
    public boolean isEmpty() {
        return  this.modelMap.isEmpty();
    }

    @objid ("8a5cb627-7573-4a14-a235-d02c6d07e725")
    public Set<CDOObject> keySet() {
        return  this.modelMap.keySet();
    }

    @objid ("bddac02a-2f35-4c6e-9773-5b725bfef115")
    public CamelElement put(CDOObject key, CamelElement value) {
        return  this.modelMap.put(key, value);
    }

    @objid ("f0cee994-18bf-4589-9438-e8079e0fed2c")
    public CamelElement remove(CDOObject key) {
        return  this.modelMap.remove(key);
    }

    @objid ("9d55bc3a-1984-456e-8e45-25d841a1714d")
    public int size() {
        return  this.modelMap.size();
    }

    @objid ("917fffd4-c4e6-4448-8972-4a6876f36c68")
    public Collection<CamelElement> values() {
        return  this.modelMap.values();
    }

    @objid ("f9ab3c7b-a095-4816-a655-1833f4e855dc")
    private ImportMap() {
        this.modelMap = new HashMap<>();
    }

}
