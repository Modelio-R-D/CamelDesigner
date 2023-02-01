/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("ecb808fa-2813-460d-9f01-e9418754164e")
    public static final String STEREOTYPE_NAME = "ResourceFilter";

    @objid ("198b34c5-324f-4981-bb98-2221f0aab6b1")
=======
    @objid ("d18aaf27-b7bb-4e20-85c2-589714998935")
    public static final String STEREOTYPE_NAME = "ResourceFilter";

    @objid ("4a0d2c25-58fc-4e07-8bda-6ef87b0f0ef9")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String RESOURCEPATTERN_TAGTYPE = "resourcePattern";

    /**
     * Tells whether a {@link ResourceFilter proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << ResourceFilter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("a220d5d7-8a0c-4120-9672-cc1f4c6d2b7e")
=======
    @objid ("2eef8b53-ac92-42be-903f-210f83982b71")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ResourceFilter.STEREOTYPE_NAME));
    }

<<<<<<< HEAD
    @objid ("ffe9fb26-7f65-476a-b048-6d49f1280f2e")
=======
    @objid ("d5a2926a-aa11-4434-a680-e8b77d174eb4")
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
        ResourceFilter other = (ResourceFilter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("a9288bb1-28ec-40e8-b276-e164e26bfe1e")
=======
    @objid ("7f931b7a-a732-4fbb-b3ed-01af4fc5400e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'resourcePattern'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("8a3f4dea-217a-45db-b874-9e7012f435c3")
=======
    @objid ("d6c11861-3d08-4b02-9722-7cde42b059a8")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getResourcePattern() {
        return this.elt.getTagValue(ResourceFilter.MdaTypes.RESOURCEPATTERN_TAGTYPE_ELT);
    }

<<<<<<< HEAD
    @objid ("12d64863-9259-4796-b907-9c84ba9096d0")
=======
    @objid ("aa71a062-99a0-4d22-a7e1-53a98a3e0846")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'resourcePattern'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("c094081d-7e2d-4171-8762-f9566f037532")
=======
    @objid ("5092da9b-bc8c-4d6f-b53e-0470ab69c87e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("17cc1e8c-335f-4a76-8841-e934b00b1cce")
=======
    @objid ("e9db0839-b71e-475b-a779-bda4e4be0bf3")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected ResourceFilter(final Class elt) {
        super(elt);
    }

    @objid ("bd4f750f-80f9-4a53-854a-cfc985bd16a5")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("2978143b-4383-45ab-ad79-57f7d51f953e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0173b7ce-b734-4009-9d46-dbd035d4dcfb")
        public static TagType RESOURCEPATTERN_TAGTYPE_ELT;

        @objid ("1d154187-57b8-456b-979c-b91ad8317535")
        private static Stereotype MDAASSOCDEP;

        @objid ("c913e8b1-70ac-45d5-a320-b77e3a188a38")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2175c3db-2858-44d8-82b6-41b88cf3e19a")
=======
        @objid ("dbe3d621-7871-49dd-91ce-32bcf05eb9a6")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1e0dfef2-991b-411e-a9cf-c911ae6d8784")
        public static TagType RESOURCEPATTERN_TAGTYPE_ELT;

        @objid ("11af153d-b347-4d9b-bfcb-f3d4800c68a4")
        private static Stereotype MDAASSOCDEP;

        @objid ("4e79e1dc-e79c-4415-80c0-7fc4bf30eba7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6470638c-b307-495f-8d18-4cb0d22c7e94")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
