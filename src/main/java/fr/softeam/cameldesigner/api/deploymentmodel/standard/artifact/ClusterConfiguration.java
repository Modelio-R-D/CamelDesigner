/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/15/23 5:37 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.attribute.AttributeAttribute;
import fr.softeam.cameldesigner.api.camelcore.standard.attribute.MeasurableAttributeAttribute;
import fr.softeam.cameldesigner.api.camelcore.standard.attribute.QualityAttributeAttribute;
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
import org.modelio.metamodel.uml.statik.Artifact;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Artifact} with << ClusterConfiguration >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("63aa1a3f-c5f3-4c42-becc-dcda24f024a0")
public class ClusterConfiguration extends Configuration {
    @objid ("20ac333a-1a85-4d16-9fa1-0843f89d13fe")
    public static final String STEREOTYPE_NAME = "ClusterConfiguration";

    @objid ("e5de10f8-3cb6-4fe4-9b16-41cb5c5c37da")
    public static final String DOWNLOADURL_TAGTYPE = "downloadURL";

    /**
     * Tells whether a {@link ClusterConfiguration proxy} can be instantiated from a {@link MObject} checking it is a {@link Artifact} stereotyped << ClusterConfiguration >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("877ce604-9fc1-4cac-80a0-727f7dd36234")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Artifact) && ((Artifact) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ClusterConfiguration.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Artifact} stereotyped << ClusterConfiguration >> then instantiate a {@link ClusterConfiguration} proxy.
     * 
     * @return a {@link ClusterConfiguration} proxy on the created {@link Artifact}.
     */
    @objid ("1e3ce093-72bd-4bf7-8037-84af7567d571")
    public static ClusterConfiguration create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Artifact");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, ClusterConfiguration.STEREOTYPE_NAME);
        return ClusterConfiguration.instantiate((Artifact)e);
    }

    /**
     * Tries to instantiate a {@link ClusterConfiguration} proxy from a {@link Artifact} stereotyped << ClusterConfiguration >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Artifact
     * @return a {@link ClusterConfiguration} proxy or <i>null</i>.
     */
    @objid ("c88be351-a803-40eb-b671-9d667758f21c")
    public static ClusterConfiguration instantiate(final Artifact obj) {
        return ClusterConfiguration.canInstantiate(obj) ? new ClusterConfiguration(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ClusterConfiguration} proxy from a {@link Artifact} stereotyped << ClusterConfiguration >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Artifact}
     * @return a {@link ClusterConfiguration} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("76351607-5306-4f08-803b-622f8024a4d2")
    public static ClusterConfiguration safeInstantiate(final Artifact obj) throws IllegalArgumentException {
        if (ClusterConfiguration.canInstantiate(obj))
        	return new ClusterConfiguration(obj);
        else
        	throw new IllegalArgumentException("ClusterConfiguration: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'configParameters' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("befe4369-c5cd-47ba-9cb6-0133adba16da")
    public void addConfigParameters(final AttributeAttribute obj) {
        if (obj!=null)
          ((Artifact) this.elt).getOwnedAttribute().add(obj.getElement());
    }

    @objid ("ae6ad2f2-3bd6-4f0d-8632-c3963d21c79e")
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
        ClusterConfiguration other = (ClusterConfiguration) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the values of the 'configParameters' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("6ff1ca0a-00b4-4c69-b159-cbe66a3204ce")
    public List<AttributeAttribute> getConfigParameters() {
        List<AttributeAttribute> results = new ArrayList<>();
        for (Attribute mObj : ((Artifact) this.elt).getOwnedAttribute()){
        	if (MeasurableAttributeAttribute.canInstantiate(mObj))
        			results.add((MeasurableAttributeAttribute)CamelDesignerProxyFactory.instantiate(mObj, MeasurableAttributeAttribute.STEREOTYPE_NAME));
        	if (QualityAttributeAttribute.canInstantiate(mObj))
        			results.add((QualityAttributeAttribute)CamelDesignerProxyFactory.instantiate(mObj, QualityAttributeAttribute.STEREOTYPE_NAME));
        	if (AttributeAttribute.canInstantiate(mObj))
        			results.add((AttributeAttribute)CamelDesignerProxyFactory.instantiate(mObj, AttributeAttribute.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Getter for string property 'downloadURL'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6fd56db5-23cb-45e3-bc20-671b1ef54e06")
    public String getDownloadURL() {
        return this.elt.getTagValue(ClusterConfiguration.MdaTypes.DOWNLOADURL_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Artifact}. 
     * @return the Artifact represented by this proxy, never null.
     */
    @objid ("ed2096b8-1416-45ca-b77f-72216991e650")
    @Override
    public Artifact getElement() {
        return (Artifact)super.getElement();
    }

    @objid ("1b4d7021-1c4a-425a-bfaf-6d948bc05175")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'configParameters' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("54703e82-951d-4f5f-b0b1-7165dd8308d9")
    public boolean removeConfigParameters(final AttributeAttribute obj) {
        return (obj!=null)? ((Artifact) this.elt).getOwnedAttribute().remove(obj.getElement()) : false;
    }

    /**
     * Setter for string property 'downloadURL'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("636df7dc-3742-43b5-96b5-9ed86b564e46")
    public void setDownloadURL(final String value) {
        this.elt.putTagValue(ClusterConfiguration.MdaTypes.DOWNLOADURL_TAGTYPE_ELT, value);
    }

    @objid ("b232fc30-14c3-4c7c-b17e-9d7e4173b7b4")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("500cb3e1-04f1-49fe-80f5-81c8734758ad")
    protected ClusterConfiguration(final Artifact elt) {
        super(elt);
    }

    @objid ("6a9ae6c0-8629-45e2-ab3b-cb4a2ca54edb")
    public static final class MdaTypes {
        @objid ("fbba2f3d-0689-4db6-8f25-36580a3bc0c9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a519e1a2-bb70-4849-9460-2ba284a5e217")
        public static TagType DOWNLOADURL_TAGTYPE_ELT;

        @objid ("78e2d748-a56a-4ffc-aba6-bef98f5eff9f")
        private static Stereotype MDAASSOCDEP;

        @objid ("b5a437d7-06ec-49e5-9194-c226d317fb20")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("cc6a54ac-f8ef-4058-869d-30d3e04be154")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b8d5ac50-75fd-4e01-9d50-04e6139e072c");
            DOWNLOADURL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "33966f3f-93c8-4e48-88fc-3e4ca226da16");
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
