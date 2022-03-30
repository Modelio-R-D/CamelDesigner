/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.08

 * This file was generated on 3/30/22 3:18 PM by Modelio Studio.
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
    @objid ("4cf3fb8e-7686-4140-8d30-7e29013431f5")
    public static final String STEREOTYPE_NAME = "MmsPropertyInstance";

    @objid ("ccb5149c-745e-4347-acb5-04b17dc39cbe")
    public static final String PROPERTYVALUE_TAGTYPE = "propertyValue";

    /**
     * Tells whether a {@link MmsPropertyInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link AttributeLink} stereotyped << MmsPropertyInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("78405dfd-9878-43ae-bced-f72fef88de16")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AttributeLink) && ((AttributeLink) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MmsPropertyInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AttributeLink} stereotyped << MmsPropertyInstance >> then instantiate a {@link MmsPropertyInstance} proxy.
     * 
     * @return a {@link MmsPropertyInstance} proxy on the created {@link AttributeLink}.
     */
    @objid ("67b7e0af-b2c5-4c1d-afeb-d52d2ddcc0cd")
    public static MmsPropertyInstance create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.AttributeLink");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, MmsPropertyInstance.STEREOTYPE_NAME);
        return MmsPropertyInstance.instantiate((AttributeLink)e);
    }

    /**
     * Tries to instantiate a {@link MmsPropertyInstance} proxy from a {@link AttributeLink} stereotyped << MmsPropertyInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AttributeLink
     * @return a {@link MmsPropertyInstance} proxy or <i>null</i>.
     */
    @objid ("724cfd6c-25e6-435e-8236-cd466706120a")
    public static MmsPropertyInstance instantiate(final AttributeLink obj) {
        return MmsPropertyInstance.canInstantiate(obj) ? new MmsPropertyInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MmsPropertyInstance} proxy from a {@link AttributeLink} stereotyped << MmsPropertyInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AttributeLink}
     * @return a {@link MmsPropertyInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e92c2cdf-e6d5-4b94-8ada-d82da7c54be2")
    public static MmsPropertyInstance safeInstantiate(final AttributeLink obj) throws IllegalArgumentException {
        if (MmsPropertyInstance.canInstantiate(obj))
        	return new MmsPropertyInstance(obj);
        else
        	throw new IllegalArgumentException("MmsPropertyInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6e87ab69-3ed8-4b1d-8aa5-63bd80cb5b6f")
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
     * 
     */
    @objid ("89399639-a730-42c4-ae98-dc7f296cbad4")
    public MmsConceptInstance getConceptInstance() {
        return (MmsConceptInstance)CamelDesignerProxyFactory.instantiate(((AttributeLink) this.elt).getAttributed(), MmsConceptInstance.STEREOTYPE_NAME);
    }

    /**
     * Get the underlying {@link AttributeLink}. 
     * @return the AttributeLink represented by this proxy, never null.
     */
    @objid ("6f1c805d-9b9c-48dd-97e4-6d0561c18203")
    @Override
    public AttributeLink getElement() {
        return (AttributeLink)super.getElement();
    }

    /**
     * Get the value to the 'isA' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("ca0c77f3-8f51-430a-b513-3ca925a9862b")
    public MmsProperty getIsA() {
        return (MmsProperty)CamelDesignerProxyFactory.instantiate(((AttributeLink) this.elt).getBase(), MmsProperty.STEREOTYPE_NAME);
    }

    /**
     * Getter for string property 'propertyValue'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("1e6fe6a5-a232-45b3-85a5-8e8758b7ad33")
    public String getPropertyValue() {
        return this.elt.getTagValue(MmsPropertyInstance.MdaTypes.PROPERTYVALUE_TAGTYPE_ELT);
    }

    @objid ("db1ec227-d718-4ec9-ad82-aea05426816a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'conceptInstance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("44f24b3d-920d-4337-bbed-e32705f7082e")
    public void setConceptInstance(final MmsConceptInstance obj) {
        ((AttributeLink) this.elt).setAttributed((obj != null) ? obj.getElement() : null);
    }

    /**
     * Set the value of the 'isA' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("adcb20cb-b71e-4a48-8a3c-fb54ccae09bc")
    public void setIsA(final MmsProperty obj) {
        ((AttributeLink) this.elt).setBase((obj != null) ? obj.getElement() : null);
    }

    /**
     * Setter for string property 'propertyValue'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("a141c143-da7d-458d-8d3e-d3a9d9f4d396")
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

    @objid ("fc2f8724-eb1a-4d05-aafd-67c56043b1be")
    protected MmsPropertyInstance(final AttributeLink elt) {
        super(elt);
    }

    @objid ("3974f7b7-9317-4102-aa68-17990b0b6b2f")
    public static final class MdaTypes {
        @objid ("e3042efd-ce38-4361-852a-1cc5d1ebdbe9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("477c848b-20b0-4c53-8839-589a5c35fd9e")
        public static TagType PROPERTYVALUE_TAGTYPE_ELT;

        @objid ("294ed0e1-5203-4703-8530-4e7f21e10727")
        private static Stereotype MDAASSOCDEP;

        @objid ("1f26b10b-88b0-4600-a731-7a26cb35e51c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("dff8e738-238e-4339-99cc-d2dae8631608")
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
