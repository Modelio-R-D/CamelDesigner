/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("ad43a6b2-753d-4521-af7f-1139a27ad968")
    public static final String STEREOTYPE_NAME = "ClusterConfiguration";

    @objid ("a0676cf6-29f1-4ad2-8075-b62581d33260")
=======
    @objid ("823043a3-5baf-45cc-abfe-a43b2710975c")
    public static final String STEREOTYPE_NAME = "ClusterConfiguration";

    @objid ("76252c8a-7d94-490d-a099-ee03269208c5")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String DOWNLOADURL_TAGTYPE = "downloadURL";

    /**
     * Tells whether a {@link ClusterConfiguration proxy} can be instantiated from a {@link MObject} checking it is a {@link Artifact} stereotyped << ClusterConfiguration >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("85135024-94a7-4de8-93fc-2e3cb83ec927")
=======
    @objid ("fe546c54-ecd3-4188-b10b-7233994e1a69")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Artifact) && ((Artifact) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ClusterConfiguration.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Artifact} stereotyped << ClusterConfiguration >> then instantiate a {@link ClusterConfiguration} proxy.
     * 
     * @return a {@link ClusterConfiguration} proxy on the created {@link Artifact}.
     */
<<<<<<< HEAD
    @objid ("5257d74b-b618-47f2-a41a-1fdda1045381")
=======
    @objid ("7c274ef3-eefb-4ed1-a4ba-7646c60bffe5")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("7fc4ae6c-954c-4945-81e7-964cafe1d158")
=======
    @objid ("ea25fbac-0496-498d-9c46-23a910136841")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("fe6f23e0-dd30-453b-a402-02bee762019f")
=======
    @objid ("f1c5ae58-0041-4df5-b211-819952f0be19")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("c43f2621-da6b-4dab-97c3-550b911bba63")
=======
    @objid ("0a4a4e6a-10ae-471a-9715-097f37d2635b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addConfigParameters(final AttributeAttribute obj) {
        if (obj!=null)
          ((Artifact) this.elt).getOwnedAttribute().add(obj.getElement());
    }

<<<<<<< HEAD
    @objid ("287bbcbf-7075-483b-8e0d-70afa679fa92")
=======
    @objid ("cb83fe09-d04b-459d-87fe-0e9e5552e468")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("27ff8025-1aef-4fa6-8afb-750de7c594f0")
=======
    @objid ("b1757f85-f50a-49d4-931b-4d7c87218160")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("e99bb726-7987-49d4-89d9-0f0e1f776e58")
=======
    @objid ("443fcd16-88e9-4d35-8bf7-011ff6f45826")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getDownloadURL() {
        return this.elt.getTagValue(ClusterConfiguration.MdaTypes.DOWNLOADURL_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Artifact}. 
     * @return the Artifact represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("4b98390f-01bd-4021-abc9-5a7549881968")
=======
    @objid ("42970f88-2d77-4e63-ae8b-1d7af9780b94")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Artifact getElement() {
        return (Artifact)super.getElement();
    }

<<<<<<< HEAD
    @objid ("c4fc75b8-7394-40cf-865f-e0c096c4d019")
=======
    @objid ("e345f35a-1725-44f0-8c9d-149715969777")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("1f9fbb9e-277f-4426-a9fe-601df94e4014")
=======
    @objid ("a04a6209-26c9-4523-80e4-409781a84e8d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeConfigParameters(final AttributeAttribute obj) {
        return (obj!=null)? ((Artifact) this.elt).getOwnedAttribute().remove(obj.getElement()) : false;
    }

    /**
     * Setter for string property 'downloadURL'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("3cb14af5-2dd7-4e0c-94bb-bbb7205c248a")
=======
    @objid ("8e27f905-74d9-429d-bb4b-9b754df02037")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("fd0c35cf-ba65-4a48-bb88-9c07a4bdc105")
=======
    @objid ("80067484-be57-430b-952e-437a21797d12")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected ClusterConfiguration(final Artifact elt) {
        super(elt);
    }

    @objid ("6a9ae6c0-8629-45e2-ab3b-cb4a2ca54edb")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("2ad71d36-fc74-4123-bcab-26ad6842dbb0")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d6a389ab-a7d5-4b4c-895f-1d810f6a2692")
        public static TagType DOWNLOADURL_TAGTYPE_ELT;

        @objid ("719d9853-6fa9-45c1-a852-01344f903d0b")
        private static Stereotype MDAASSOCDEP;

        @objid ("8c5046f7-e9b7-4e61-b102-48fd85bf8e36")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f148ec84-7d6f-45b9-ac94-7a0bdbeda0ff")
=======
        @objid ("e7f257b6-85d4-40d6-a595-d9cbfdcd3799")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5d87f31d-7969-46b8-ac8c-70d603d236c2")
        public static TagType DOWNLOADURL_TAGTYPE_ELT;

        @objid ("b0561bdd-c5d7-4600-82b6-7f0608b1bce2")
        private static Stereotype MDAASSOCDEP;

        @objid ("a9d0445f-7cb9-4e49-989b-6dbdefe6dbe2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("677fb1ee-fb80-4ae7-a344-6e718ef6795e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
