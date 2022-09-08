/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
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
    @objid ("1b38773b-69e7-4436-af79-e8d20c234ebc")
    public static final String STEREOTYPE_NAME = "ClusterConfiguration";

    @objid ("745bbcd3-85ac-41fa-ab04-0498f66abdd8")
    public static final String DOWNLOADURL_TAGTYPE = "downloadURL";

    /**
     * Tells whether a {@link ClusterConfiguration proxy} can be instantiated from a {@link MObject} checking it is a {@link Artifact} stereotyped << ClusterConfiguration >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a43366cc-06a8-4207-90f0-116e1c197510")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Artifact) && ((Artifact) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ClusterConfiguration.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Artifact} stereotyped << ClusterConfiguration >> then instantiate a {@link ClusterConfiguration} proxy.
     * 
     * @return a {@link ClusterConfiguration} proxy on the created {@link Artifact}.
     */
    @objid ("c9453906-50a2-4c7e-bf2e-5fadb1724de0")
    public static ClusterConfiguration create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Artifact");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, ClusterConfiguration.STEREOTYPE_NAME);
        return ClusterConfiguration.instantiate((Artifact)e);
    }

    /**
     * Tries to instantiate a {@link ClusterConfiguration} proxy from a {@link Artifact} stereotyped << ClusterConfiguration >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Artifact
     * @return a {@link ClusterConfiguration} proxy or <i>null</i>.
     */
    @objid ("803ec7e6-9dfd-4bb6-8695-12f94eec7b84")
    public static ClusterConfiguration instantiate(final Artifact obj) {
        return ClusterConfiguration.canInstantiate(obj) ? new ClusterConfiguration(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ClusterConfiguration} proxy from a {@link Artifact} stereotyped << ClusterConfiguration >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Artifact}
     * @return a {@link ClusterConfiguration} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("ac93f373-db50-4387-9609-ceeb3de2ea2f")
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
     */
    @objid ("49fe8f55-b5df-4d37-a325-205f0648cafb")
    public void addConfigParameters(final AttributeAttribute obj) {
        if (obj!=null)
          ((Artifact) this.elt).getOwnedAttribute().add(obj.getElement());
    }

    @objid ("faf82ea0-622a-4b7b-9fbb-b7e97f88c325")
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
     */
    @objid ("ea784a8b-89e5-4a53-8ec2-5d8a77cc594e")
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
    @objid ("f5fed39b-0d26-48a9-af9f-9372b4080fb0")
    public String getDownloadURL() {
        return this.elt.getTagValue(ClusterConfiguration.MdaTypes.DOWNLOADURL_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Artifact}.
     * 
     * @return the Artifact represented by this proxy, never null.
     */
    @objid ("58a5c1f4-f043-4a76-9637-009bd276666b")
    @Override
    public Artifact getElement() {
        return (Artifact)super.getElement();
    }

    @objid ("b3c75078-a739-4861-93ff-5e839d962eb7")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'configParameters' role.<p>
     * Role description:
     * null
     */
    @objid ("73794052-be42-48e2-b19a-3030675afeeb")
    public boolean removeConfigParameters(final AttributeAttribute obj) {
        return (obj!=null)? ((Artifact) this.elt).getOwnedAttribute().remove(obj.getElement()) : false;
    }

    /**
     * Setter for string property 'downloadURL'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e495aa3f-87d0-4567-90bb-2adf3e228069")
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

    @objid ("1fd71912-26bf-4bfa-b4f4-c3890c0b7c90")
    protected ClusterConfiguration(final Artifact elt) {
        super(elt);
    }

    @objid ("6a9ae6c0-8629-45e2-ab3b-cb4a2ca54edb")
    public static final class MdaTypes {
        @objid ("a81842a5-a27a-4bbf-900f-3db5fa212e04")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0cbfb762-343e-4a23-8b6b-23acacc512f7")
        public static TagType DOWNLOADURL_TAGTYPE_ELT;

        @objid ("6e08a710-343e-4e2a-873d-ab78aadf55c7")
        private static Stereotype MDAASSOCDEP;

        @objid ("24b04f33-fba1-4dad-b231-6cdb032bddbe")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("252d39b9-7607-407d-bdbd-97953d78c2b7")
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
