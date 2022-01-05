/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.05

 * This file was generated on 11/24/21 6:53 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.metadatamodel.standard.attributelink;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.metadatamodel.infrastructure.modelelement.MmsObject;
import fr.softeam.cameldesigner.api.metadatamodel.standard.attribute.MmsProperty;
import fr.softeam.cameldesigner.api.metadatamodel.standard.instance.MmsConceptInstance;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.AttributeLink;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AttributeLink} with << MmsPropertyInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("09e9e24f-9c1d-4cfb-b3bb-bf35bf56c7f5")
public class MmsPropertyInstance extends MmsObject {
    @objid ("1b77e548-01b1-40c2-a027-3ce94a7f7ce3")
    public static final String STEREOTYPE_NAME = "MmsPropertyInstance";

    @objid ("6a4bcf68-e58a-4ce7-96f3-287875368972")
    public static final String PROPERTYVALUE_TAGTYPE = "propertyValue";

    /**
     * Tells whether a {@link MmsPropertyInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link AttributeLink} stereotyped << MmsPropertyInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ef44123e-ad8d-47f1-9edf-f1a5da31a1af")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AttributeLink) && ((AttributeLink) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MmsPropertyInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AttributeLink} stereotyped << MmsPropertyInstance >> then instantiate a {@link MmsPropertyInstance} proxy.
     * 
     * @return a {@link MmsPropertyInstance} proxy on the created {@link AttributeLink}.
     */
    @objid ("984b5d21-d733-447c-b1de-b90157e46b1d")
    public static MmsPropertyInstance create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.AttributeLink");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, MmsPropertyInstance.STEREOTYPE_NAME);
        return MmsPropertyInstance.instantiate((AttributeLink)e);
    }

    /**
     * Tries to instantiate a {@link MmsPropertyInstance} proxy from a {@link AttributeLink} stereotyped << MmsPropertyInstance >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a AttributeLink
     * @return a {@link MmsPropertyInstance} proxy or <i>null</i>.
     */
    @objid ("2715ddbd-1771-4d43-aec1-d0c8c1743f76")
    public static MmsPropertyInstance instantiate(final AttributeLink obj) {
        return MmsPropertyInstance.canInstantiate(obj) ? new MmsPropertyInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MmsPropertyInstance} proxy from a {@link AttributeLink} stereotyped << MmsPropertyInstance >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link AttributeLink}
     * @return a {@link MmsPropertyInstance} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("ed2a829e-2ee5-4e29-bcd2-b646aaaee879")
    public static MmsPropertyInstance safeInstantiate(final AttributeLink obj) throws IllegalArgumentException {
        if (MmsPropertyInstance.canInstantiate(obj))
            return new MmsPropertyInstance(obj);
        else
            throw new IllegalArgumentException("MmsPropertyInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d8daab6a-cf58-49be-a96d-a553a79e7503")
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
        MmsPropertyInstance other = (MmsPropertyInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value of the 'conceptInstance' role.<p>
     * Role description:
     * null
     */
    @objid ("d2c45e5d-bcbf-4fce-832f-7b547b742c73")
    public MmsConceptInstance getConceptInstance() {
        for (Dependency d : this.elt.getImpactedDependency()) {
          if (d.isStereotyped(MmsPropertyInstance.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(MmsPropertyInstance.MdaTypes.MDAASSOCDEP_ROLE), "propertyInstance")
              && MmsConceptInstance.canInstantiate(d.getImpacted())) {
                  return (MmsConceptInstance)CamelDesignerProxyFactory.instantiate(d.getImpacted(), MmsConceptInstance.MdaTypes.STEREOTYPE_ELT.getName());
          }
        }
        return null;
    }

    /**
     * Get the underlying {@link AttributeLink}.
     * 
     * @return the AttributeLink represented by this proxy, never null.
     */
    @objid ("094bb05b-26bb-44ff-803b-d820d8733c3b")
    @Override
    public AttributeLink getElement() {
        return (AttributeLink)super.getElement();
    }

    /**
     * Getter for string property 'propertyValue'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("862d0fb0-fa8b-4016-be5e-6b9618b0de53")
    public String getPropertyValue() {
        return this.elt.getTagValue(MmsPropertyInstance.MdaTypes.PROPERTYVALUE_TAGTYPE_ELT);
    }

    @objid ("a8ba18bb-3912-4376-a8ee-571aae8bef71")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'conceptInstance' role.<p>
     * Role description:
     * null
     */
    @objid ("00a3274d-daeb-4bf5-a48f-a92f9df8db48")
    public void setConceptInstance(final MmsConceptInstance obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getImpactedDependency())
          if (d.isStereotyped(MmsPropertyInstance.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MmsPropertyInstance.MdaTypes.MDAASSOCDEP_ROLE), "propertyInstance")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if (dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(obj.getElement(), this.elt, MmsPropertyInstance.MdaTypes.MDAASSOCDEP);
              dep.setName("propertyInstance");
              dep.putTagValue(MmsPropertyInstance.MdaTypes.MDAASSOCDEP_ROLE, "propertyInstance");
          }
          dep.setImpacted(obj.getElement());
        }
    }

    /**
     * Setter for string property 'propertyValue'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("47e8bc2f-6346-4a21-b829-0feea7f7544a")
    public void setPropertyValue(final String value) {
        this.elt.putTagValue(MmsPropertyInstance.MdaTypes.PROPERTYVALUE_TAGTYPE_ELT, value);
    }

    @objid ("2b38b8de-1944-465d-9c18-f74e864f65ae")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("e3b3f838-091c-413f-8992-3c0bdd6de976")
    public MmsProperty getIsA() {
        Attribute attribute = this.getElement().getBase();
        if ((attribute != null) && (MmsProperty.canInstantiate(attribute))) {
            return MmsProperty.instantiate((Attribute) attribute);
        }
        return null;
    }

    @objid ("6c5c404e-a2a2-4c58-a899-9e9cba226d6f")
    public void setIsA(MmsProperty mmsProperty) {
        this.getElement().setBase(mmsProperty.getElement());
    }

    @objid ("2781e715-19d8-46de-b53f-044802e7f601")
    protected MmsPropertyInstance(final AttributeLink elt) {
        super(elt);
    }

    @objid ("3974f7b7-9317-4102-aa68-17990b0b6b2f")
    public static final class MdaTypes {
        @objid ("1dc5b4c8-2c26-4de6-b93d-ace48e3a28bf")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9d3d9148-3243-47a8-b690-586301e5a5a3")
        public static TagType PROPERTYVALUE_TAGTYPE_ELT;

        @objid ("b9ba5f73-fca4-4cf1-997e-2ebec14fa1aa")
        private static Stereotype MDAASSOCDEP;

        @objid ("cf038822-590b-4b33-9151-c0f9c755bb2c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("312e5e04-b90a-4941-b791-3d74001d98c4")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "f4953787-31fa-4eed-88df-83d5ad51d82e");
            PROPERTYVALUE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1df65abe-3c98-4cde-9656-91b11230e762");
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
