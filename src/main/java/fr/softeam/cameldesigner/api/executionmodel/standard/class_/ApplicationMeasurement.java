/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/23/22 5:02 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.executionmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
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
 * Proxy class to handle a {@link Class} with << ApplicationMeasurement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("164b2229-0807-45e3-bcba-6b09194928b2")
public class ApplicationMeasurement extends Measurement {
    @objid ("1e50f672-ef2d-4bd6-8f01-3062bdd8c8f7")
    public static final String STEREOTYPE_NAME = "ApplicationMeasurement";

    /**
     * Tells whether a {@link ApplicationMeasurement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << ApplicationMeasurement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("af559fbe-6a1c-4403-874a-83d1ffae0730")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ApplicationMeasurement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << ApplicationMeasurement >> then instantiate a {@link ApplicationMeasurement} proxy.
     * 
     * @return a {@link ApplicationMeasurement} proxy on the created {@link Class}.
     */
    @objid ("9503ebdc-30bb-4573-af2a-4934f9bef086")
    public static ApplicationMeasurement create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, ApplicationMeasurement.STEREOTYPE_NAME);
        return ApplicationMeasurement.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link ApplicationMeasurement} proxy from a {@link Class} stereotyped << ApplicationMeasurement >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link ApplicationMeasurement} proxy or <i>null</i>.
     */
    @objid ("b16d89d8-f255-485e-89e5-a06a361ef187")
    public static ApplicationMeasurement instantiate(final Class obj) {
        return ApplicationMeasurement.canInstantiate(obj) ? new ApplicationMeasurement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ApplicationMeasurement} proxy from a {@link Class} stereotyped << ApplicationMeasurement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link ApplicationMeasurement} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("89b86409-732d-48b2-b041-db8b064dbfae")
    public static ApplicationMeasurement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (ApplicationMeasurement.canInstantiate(obj))
        	return new ApplicationMeasurement(obj);
        else
        	throw new IllegalArgumentException("ApplicationMeasurement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e6e3d74e-bce3-472b-bbe9-340fc607f0c7")
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
        ApplicationMeasurement other = (ApplicationMeasurement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("b627fa1f-8070-450e-83c4-7a035943818d")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("23c8c67e-1acb-42a8-85ff-239762bbb6a2")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("d1802701-5ffa-4c53-82d0-a0ce3a96aad1")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("c0299beb-ea7a-4da5-8553-9333895984a4")
    protected ApplicationMeasurement(final Class elt) {
        super(elt);
    }

    @objid ("c03973d2-687e-4c2b-b6af-b5fe5dfcf3e3")
    public static final class MdaTypes {
        @objid ("57a35415-06ec-4eaf-a9d6-8eff6970fcb2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7cfe3599-7620-446b-b970-1220ed4525f0")
        private static Stereotype MDAASSOCDEP;

        @objid ("99216f03-83a7-4b90-b359-a7c367bde325")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("68b0f52a-d5a2-4cd3-b976-5ad97cc6109b")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "8962d6e6-e540-41c6-bf79-3df6530aae2e");
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
