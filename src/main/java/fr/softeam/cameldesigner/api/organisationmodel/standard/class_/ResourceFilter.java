/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.organisationmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass;
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
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << ResourceFilter >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("53eb9b5e-52a6-497a-9bde-4d9f38ed6449")
public abstract class ResourceFilter extends FeatureClass {
    @objid ("7bd6e882-1d66-42d0-b2b1-143183b65d9c")
    public static final String STEREOTYPE_NAME = "ResourceFilter";

    @objid ("7d188d37-aac8-4ed6-8280-bd6d1ccdc498")
    public static final String RESOURCEPATTERN_TAGTYPE = "resourcePattern";

    /**
     * Tells whether a {@link ResourceFilter proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << ResourceFilter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("887988fc-7525-4c6e-9083-0d6275306689")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ResourceFilter.STEREOTYPE_NAME));
    }

    @objid ("ce6e49c9-ba6d-483d-9469-9952c0d0cfcd")
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
        ResourceFilter other = (ResourceFilter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("d0731e94-8ea0-4c64-82fd-c33424a5e99c")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'resourcePattern'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c399e43a-7522-4e56-bca4-30228f242307")
    public String getResourcePattern() {
        return this.elt.getTagValue(ResourceFilter.MdaTypes.RESOURCEPATTERN_TAGTYPE_ELT);
    }

    @objid ("14a47639-0845-4abc-a459-7b75d179363e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'resourcePattern'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c28556e1-e122-4616-afe8-60535924008d")
    public void setResourcePattern(final String value) {
        this.elt.putTagValue(ResourceFilter.MdaTypes.RESOURCEPATTERN_TAGTYPE_ELT, value);
    }

    @objid ("56a320f0-0da6-4d9a-8300-96bbe79f7ee9")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("6210d445-da8f-45f7-ba2a-f1fa3962f388")
    protected ResourceFilter(final Class elt) {
        super(elt);
    }

    @objid ("bd4f750f-80f9-4a53-854a-cfc985bd16a5")
    public static final class MdaTypes {
        @objid ("73e5426a-0d1b-4bb3-bcc4-b28d3cc58210")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("39507e23-fd07-4d12-bee0-bed2140645d9")
        public static TagType RESOURCEPATTERN_TAGTYPE_ELT;

        @objid ("1d33432e-ec21-4fb3-94c2-fa95bcf76065")
        private static Stereotype MDAASSOCDEP;

        @objid ("f3ddf91c-26e1-45eb-a41a-40e02263a04a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a9eba84e-3a59-4aaa-9526-62f2377e890f")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "ce775666-60ae-48ab-94dd-b9a12b9edf2f");
            RESOURCEPATTERN_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4a71ce8e-6fc5-476d-8f32-ccf11be3149c");
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
