/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.08

 * This file was generated on 3/30/22 3:18 PM by Modelio Studio.
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
    @objid ("76266dfb-599d-43e8-9829-9dc924a0493b")
    public static final String STEREOTYPE_NAME = "ResourceFilter";

    @objid ("14f88462-8457-4280-b8f4-3380d2c0d89a")
    public static final String RESOURCEPATTERN_TAGTYPE = "resourcePattern";

    /**
     * Tells whether a {@link ResourceFilter proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << ResourceFilter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("f01a6902-b63a-4141-86ab-8b6565e772f5")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ResourceFilter.STEREOTYPE_NAME));
    }

    @objid ("32db6cc8-4bd3-4ba8-85ee-bea591be8ec0")
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
    @objid ("3c82a8bf-b8e3-429a-bd7d-05b8b487000e")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'resourcePattern'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0092e388-6aaf-49fb-9eaf-71a0a454e005")
    public String getResourcePattern() {
        return this.elt.getTagValue(ResourceFilter.MdaTypes.RESOURCEPATTERN_TAGTYPE_ELT);
    }

    @objid ("d2362fda-1b2c-4137-9d57-551c6b6f92ea")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'resourcePattern'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b404b281-101a-406a-8a6a-45a5378e4369")
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

    @objid ("78c72576-99b6-4da6-a0e4-6d7f9d9b6115")
    protected ResourceFilter(final Class elt) {
        super(elt);
    }

    @objid ("bd4f750f-80f9-4a53-854a-cfc985bd16a5")
    public static final class MdaTypes {
        @objid ("fc367434-fb1e-4dfb-b316-2bb2eedb4848")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("934b9e65-0aa6-47d2-9424-c400334decff")
        public static TagType RESOURCEPATTERN_TAGTYPE_ELT;

        @objid ("c1b06ec5-72fc-4acc-b4e9-da556c1e03d8")
        private static Stereotype MDAASSOCDEP;

        @objid ("a2b38ca2-fedf-433b-b210-f1a00e5e389d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a04c2369-08ad-4c82-9171-1a29fc841f4e")
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
