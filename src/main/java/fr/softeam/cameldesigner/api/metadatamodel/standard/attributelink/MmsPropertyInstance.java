/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.09

 * This file was generated on 4/20/22 10:37 AM by Modelio Studio.
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
import org.modelio.metamodel.uml.statik.AttributeLink;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AttributeLink} with << MmsPropertyInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("09e9e24f-9c1d-4cfb-b3bb-bf35bf56c7f5")
public class MmsPropertyInstance extends MmsObject {
    @objid ("1650c14c-3b20-41e4-a30f-d6f4fd79f56d")
    public static final String STEREOTYPE_NAME = "MmsPropertyInstance";

    @objid ("722b8721-878a-4324-988a-3850c5afb99e")
    public static final String PROPERTYVALUE_TAGTYPE = "propertyValue";

    /**
     * Tells whether a {@link MmsPropertyInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link AttributeLink} stereotyped << MmsPropertyInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ea3df7be-145f-4bad-b9fc-c1a4904bef69")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AttributeLink) && ((AttributeLink) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MmsPropertyInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AttributeLink} stereotyped << MmsPropertyInstance >> then instantiate a {@link MmsPropertyInstance} proxy.
     * 
     * @return a {@link MmsPropertyInstance} proxy on the created {@link AttributeLink}.
     */
    @objid ("278e1d3d-b5d4-4515-9b5b-9d2b2d4afa6a")
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
    @objid ("fcd6f19f-2067-454e-a32a-502aa8d12515")
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
    @objid ("e4f89df1-59a0-4e09-a198-4d4f2d0465e8")
    public static MmsPropertyInstance safeInstantiate(final AttributeLink obj) throws IllegalArgumentException {
        if (MmsPropertyInstance.canInstantiate(obj))
            return new MmsPropertyInstance(obj);
        else
            throw new IllegalArgumentException("MmsPropertyInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("9971402a-abbc-4e98-8408-5aed3fe328e9")
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
     * Get the value to the 'conceptInstance' role.<p>
     * Role description:
     * null
     */
    @objid ("ce221036-970a-4a84-9d91-40b78d3f8387")
    public MmsConceptInstance getConceptInstance() {
        return (MmsConceptInstance)CamelDesignerProxyFactory.instantiate(((AttributeLink) this.elt).getAttributed(), MmsConceptInstance.STEREOTYPE_NAME);
    }

    /**
     * Get the underlying {@link AttributeLink}.
     * 
     * @return the AttributeLink represented by this proxy, never null.
     */
    @objid ("480c52cc-6d82-4249-a2f2-ee73aec2ccbc")
    @Override
    public AttributeLink getElement() {
        return (AttributeLink)super.getElement();
    }

    /**
     * Get the value to the 'isA' role.<p>
     * Role description:
     * null
     */
    @objid ("554e5821-b7ea-4f04-868c-fff25177f6e1")
    public MmsProperty getIsA() {
        return (MmsProperty)CamelDesignerProxyFactory.instantiate(((AttributeLink) this.elt).getBase(), MmsProperty.STEREOTYPE_NAME);
    }

    /**
     * Getter for string property 'propertyValue'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f3cf6587-6e87-4650-bb92-856375f3a97a")
    public String getPropertyValue() {
        return this.elt.getTagValue(MmsPropertyInstance.MdaTypes.PROPERTYVALUE_TAGTYPE_ELT);
    }

    @objid ("e469995a-b05c-400e-a4b1-1b40e2805f95")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'conceptInstance' role.<p>
     * Role description:
     * null
     */
    @objid ("aa67a5cd-b556-488b-8443-68095ea0a381")
    public void setConceptInstance(final MmsConceptInstance obj) {
        ((AttributeLink) this.elt).setAttributed((obj != null) ? obj.getElement() : null);
    }

    /**
     * Set the value of the 'isA' role.<p>
     * Role description:
     * null
     */
    @objid ("a6e4ac47-b723-498a-a7a9-b4250df57d65")
    public void setIsA(final MmsProperty obj) {
        ((AttributeLink) this.elt).setBase((obj != null) ? obj.getElement() : null);
    }

    /**
     * Setter for string property 'propertyValue'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("96e4e99b-1200-4d01-b4f2-f632e6aa4c7f")
    public void setPropertyValue(final String value) {
        this.elt.putTagValue(MmsPropertyInstance.MdaTypes.PROPERTYVALUE_TAGTYPE_ELT, value);
    }

    @objid ("cbd490b8-d3ef-4f08-b4d2-3424ae20fe80")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("7756a89e-4ed5-4024-a9f0-e177845f8b90")
    protected MmsPropertyInstance(final AttributeLink elt) {
        super(elt);
    }

    @objid ("3974f7b7-9317-4102-aa68-17990b0b6b2f")
    public static final class MdaTypes {
        @objid ("f15f2ff8-be1e-4cfd-a7ab-a0735f6a2fb5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7f8580d2-5bb8-46b3-b259-5068d775cbaa")
        public static TagType PROPERTYVALUE_TAGTYPE_ELT;

        @objid ("a6447bca-2892-48a7-b80a-213be775accc")
        private static Stereotype MDAASSOCDEP;

        @objid ("9d67ed27-c001-42ca-aa61-6df2599eb1c3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("36e6c55e-06d4-4ec7-aa25-61213f0bc746")
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
