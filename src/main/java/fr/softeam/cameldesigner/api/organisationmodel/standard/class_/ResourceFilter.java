/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/25/22 11:13 AM by Modelio Studio.
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
    @objid ("fa24e098-34c2-47d6-8941-c7aca22a5b76")
    public static final String STEREOTYPE_NAME = "ResourceFilter";

    @objid ("3a219e15-8ac8-44b1-af1f-f5b54a61c01d")
    public static final String RESOURCEPATTERN_TAGTYPE = "resourcePattern";

    /**
     * Tells whether a {@link ResourceFilter proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << ResourceFilter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("cbb3c5cc-58fc-4a78-922c-16dec82c71da")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ResourceFilter.STEREOTYPE_NAME));
    }

    @objid ("8cec3e63-cbd4-4cba-8bcf-641ef9e7d064")
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
    @objid ("3012d9d6-445c-4dab-b98a-5e3c34167927")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'resourcePattern'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("9c825a1e-33f1-43d7-8d7a-06adbc20e012")
    public String getResourcePattern() {
        return this.elt.getTagValue(ResourceFilter.MdaTypes.RESOURCEPATTERN_TAGTYPE_ELT);
    }

    @objid ("d0626491-8a0f-47e3-9de6-cf0234f3b8cc")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'resourcePattern'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6877e538-3197-4f78-9b4c-57e6c4e91722")
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

    @objid ("a4178f24-9001-495d-9796-75358a381d11")
    protected ResourceFilter(final Class elt) {
        super(elt);
    }

    @objid ("bd4f750f-80f9-4a53-854a-cfc985bd16a5")
    public static final class MdaTypes {
        @objid ("29e238e1-365d-49be-9902-364a669cdff2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("94ef9476-2386-4218-af8a-a66aba85dde7")
        public static TagType RESOURCEPATTERN_TAGTYPE_ELT;

        @objid ("4fc95512-c9a0-4a92-959a-dd9e1881269e")
        private static Stereotype MDAASSOCDEP;

        @objid ("c44dc8e1-4e96-41bc-83bc-1e3555f3f7ca")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6b2fc788-e2ae-492d-b746-4036e93c3b43")
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
