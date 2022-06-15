/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.10

 * This file was generated on 4/27/22 11:51 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.metadatamodel.standard.package_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.SubModel;
import fr.softeam.cameldesigner.api.metadatamodel.standard.class_.MmsConcept;
import fr.softeam.cameldesigner.api.metadatamodel.standard.instance.MmsConceptInstance;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Package} with << MetaDataModel >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("bffe392b-7477-486d-851e-fb774d44120c")
public class MetaDataModel extends SubModel {
    @objid ("ea006f6e-cfb3-4be4-9356-f4a980727710")
    public static final String STEREOTYPE_NAME = "MetaDataModel";

    /**
     * Tells whether a {@link MetaDataModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << MetaDataModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e7b5d4ec-f320-4ab2-9ef5-d7360762afe5")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetaDataModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << MetaDataModel >> then instantiate a {@link MetaDataModel} proxy.
     * 
     * @return a {@link MetaDataModel} proxy on the created {@link Package}.
     */
    @objid ("7e75eeec-a56a-4995-ac6d-3680597a8870")
    public static MetaDataModel create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Package");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, MetaDataModel.STEREOTYPE_NAME);
        return MetaDataModel.instantiate((Package)e);
    }

    /**
     * Tries to instantiate a {@link MetaDataModel} proxy from a {@link Package} stereotyped << MetaDataModel >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Package
     * @return a {@link MetaDataModel} proxy or <i>null</i>.
     */
    @objid ("b986d61f-10d9-41b1-a9f5-b567592b64d8")
    public static MetaDataModel instantiate(final Package obj) {
        return MetaDataModel.canInstantiate(obj) ? new MetaDataModel(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MetaDataModel} proxy from a {@link Package} stereotyped << MetaDataModel >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Package}
     * @return a {@link MetaDataModel} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("85336758-3c7b-4f22-a79d-ef7e59051d64")
    public static MetaDataModel safeInstantiate(final Package obj) throws IllegalArgumentException {
        if (MetaDataModel.canInstantiate(obj))
            return new MetaDataModel(obj);
        else
            throw new IllegalArgumentException("MetaDataModel: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'concept' role.<p>
     * Role description:
     * null
     */
    @objid ("9d339909-6318-4b03-a031-8d4d6ac571ce")
    public void addConcept(final MmsConcept obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'conceptInstance' role.<p>
     * Role description:
     * null
     */
    @objid ("435d9407-7a26-4aa5-8a85-d7f8a5f602bb")
    public void addConceptInstance(final MmsConceptInstance obj) {
        if (obj!=null)
          ((Package) this.elt).getDeclared().add(obj.getElement());
    }

    @objid ("8be85df1-7483-46f6-b2ad-05258a96798d")
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        MetaDataModel other = (MetaDataModel) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value to the 'camelModel' role.<p>
     * Role description:
     * null
     */
    @objid ("83222711-b2f2-4818-be69-66e3895b3e92")
    public CamelModel getCamelModel() {
        return (CamelModel)CamelDesignerProxyFactory.instantiate(((Package) this.elt).getOwner(), CamelModel.STEREOTYPE_NAME);
    }

    /**
     * Get the values of the 'concept' role.<p>
     * Role description:
     * null
     */
    @objid ("a1e6b83f-17c9-4064-a413-30ec7b7a02f3")
    public List<MmsConcept> getConcept() {
        List<MmsConcept> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
            if (MmsConcept.canInstantiate(mObj))
                    results.add((MmsConcept)CamelDesignerProxyFactory.instantiate(mObj, MmsConcept.STEREOTYPE_NAME));
            }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'conceptInstance' role.<p>
     * Role description:
     * null
     */
    @objid ("cf87ccbb-0801-407f-991a-0aa8adb9f482")
    public List<MmsConceptInstance> getConceptInstance() {
        List<MmsConceptInstance> results = new ArrayList<>();
        for (Instance mObj : ((Package) this.elt).getDeclared()){
            if (MmsConceptInstance.canInstantiate(mObj))
                    results.add((MmsConceptInstance)CamelDesignerProxyFactory.instantiate(mObj, MmsConceptInstance.STEREOTYPE_NAME));
            }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Package}.
     * 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("ab04f3bd-7669-4e3e-a275-f93329e3c672")
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    @objid ("e62f4604-b396-4cb5-ac8f-998fe3889d6a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'concept' role.<p>
     * Role description:
     * null
     */
    @objid ("489ae629-b5c1-42b7-ac87-2f9f4479ea83")
    public boolean removeConcept(final MmsConcept obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'conceptInstance' role.<p>
     * Role description:
     * null
     */
    @objid ("ed60ebca-c8dc-4334-8a6e-1d7b7af826f8")
    public boolean removeConceptInstance(final MmsConceptInstance obj) {
        return (obj!=null)? ((Package) this.elt).getDeclared().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'camelModel' role.<p>
     * Role description:
     * null
     */
    @objid ("110b23a8-e5bc-43d3-83c1-a63f771b2fab")
    public void setCamelModel(final CamelModel obj) {
        ((Package) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    @objid ("4019d879-5c8e-41e5-9ae9-31509e486e55")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        result.addAll(getConcept());
        result.addAll(getConceptInstance());
        return result;
    }

    @objid ("f1b50e83-30c6-473c-9970-8823fc275b25")
    protected MetaDataModel(final Package elt) {
        super(elt);
    }

    @objid ("dcdbd03e-a04b-4330-976d-64d85bfa5c03")
    public static final class MdaTypes {
        @objid ("e4dd3634-da1c-40e5-b78c-83805cf69110")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("62d5702a-b7e1-43be-80fb-b0f213b3954a")
        private static Stereotype MDAASSOCDEP;

        @objid ("63bd5e0a-45c2-4354-a54e-86db6cd55b97")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d858c1df-7c5a-4777-a97e-7f682d5d3faf")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "73200409-c934-45d3-b418-8d71c00e7382");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


static {
        if(CamelDesignerModule.getInstance() != null) {
            init(CamelDesignerModule.getInstance().getModuleContext());
        }
    }
    }

}
