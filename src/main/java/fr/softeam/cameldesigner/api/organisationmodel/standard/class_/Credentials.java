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
 * Proxy class to handle a {@link Class} with << Credentials >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("bfb6184e-67cd-4b06-ab79-5393ce245f8e")
public abstract class Credentials extends FeatureClass {
<<<<<<< HEAD
    @objid ("b9036123-4b25-46df-b744-683bef806047")
=======
    @objid ("d046c724-1323-46a5-bdbd-5969c19f52d9")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "Credentials";

    /**
     * Tells whether a {@link Credentials proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Credentials >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("7d700f14-45bd-4cbf-9783-9192477b4bba")
=======
    @objid ("0f71cb70-1ef0-4b6c-8e40-7beb84edf2b1")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Credentials.STEREOTYPE_NAME));
    }

<<<<<<< HEAD
    @objid ("5ac406e2-ed31-4609-bfdd-a3f279f382f5")
=======
    @objid ("ce77d8e2-65b1-4cd3-9a10-9dd70e239c93")
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
        Credentials other = (Credentials) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("57b535fb-7fb0-4537-b4a6-3bf39036a4a4")
=======
    @objid ("5839d99e-615d-47b1-9cf1-30cabc7d9ed0")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

<<<<<<< HEAD
    @objid ("aaa9c490-5770-4c45-9d82-ea9df4af495a")
=======
    @objid ("9d2fd8b5-c4c7-4d36-b3ed-987ec51d1f3d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("fa0a7c97-f909-4749-9818-0bccef5688c1")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

<<<<<<< HEAD
    @objid ("b6a1fd0c-6bca-4c72-9e75-247bc5ed066b")
=======
    @objid ("7d9082df-777f-460b-bca4-28609abb74b7")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected Credentials(final Class elt) {
        super(elt);
    }

    @objid ("3a369440-6a1a-4237-9f5b-26139695cb51")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("61eb7d79-d37b-4112-be85-1c006943ef7b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d3e83aec-38dc-4dae-a520-e49b6fbdfa73")
        private static Stereotype MDAASSOCDEP;

        @objid ("90bc7d0d-4f24-4e9b-9a27-3ef335121575")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6116e610-fe3f-4be3-982e-43b158a6b703")
=======
        @objid ("d9b20644-b6bd-4c95-9a55-d10a0232bb18")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c2cb67a7-76c2-4f4f-a665-6ff7ef0f294b")
        private static Stereotype MDAASSOCDEP;

        @objid ("ac7cefdc-756d-47fe-8c9d-8d00270b4c16")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9780c644-b039-4c34-ab9b-5a5708e2efc8")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "ff07e549-20c1-4871-863d-c00d48790863");
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
