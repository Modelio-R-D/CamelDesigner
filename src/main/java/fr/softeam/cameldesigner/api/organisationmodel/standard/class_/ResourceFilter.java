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
    @objid ("27ac11e1-a987-4615-bdde-4062505cd332")
    public static final String STEREOTYPE_NAME = "ResourceFilter";

    @objid ("915a1436-9d54-4dde-8789-68838518b6bf")
    public static final String RESOURCEPATTERN_TAGTYPE = "resourcePattern";

    /**
     * Tells whether a {@link ResourceFilter proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << ResourceFilter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("8206f079-ee4b-4ea2-8e35-9bbf4df00804")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ResourceFilter.STEREOTYPE_NAME));
    }

    @objid ("f4c569b6-e70b-463b-84ff-df8477ef71ec")
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
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("1745a694-a24c-40a1-be60-63d8bcc776e9")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'resourcePattern'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7415197f-eecf-4936-84c0-06ef2f572598")
    public String getResourcePattern() {
        return this.elt.getTagValue(ResourceFilter.MdaTypes.RESOURCEPATTERN_TAGTYPE_ELT);
    }

    @objid ("8333e114-fc04-443c-b59e-7a0ca043dff4")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'resourcePattern'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("83684a6d-85a9-4001-ab1f-55e1407cbaeb")
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

    @objid ("9a196597-8b52-4e6f-8e39-8fe056d9633b")
    protected ResourceFilter(final Class elt) {
        super(elt);
    }

    @objid ("bd4f750f-80f9-4a53-854a-cfc985bd16a5")
    public static final class MdaTypes {
        @objid ("b4a051b4-2655-4fe1-a33f-87d2be331501")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("773fe98b-56a2-4e92-b4f2-0af9cff5d0ab")
        public static TagType RESOURCEPATTERN_TAGTYPE_ELT;

        @objid ("fa65dac6-3476-42c7-819f-4f49a48330b8")
        private static Stereotype MDAASSOCDEP;

        @objid ("e27b8e67-afc7-41c6-b225-fc0d1881bdd3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a683f205-14e0-45e9-a62a-455869e74940")
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
