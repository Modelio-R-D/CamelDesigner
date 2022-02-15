/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/15/22 11:06 PM by Modelio Studio.
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
    @objid ("9166ef89-5a7e-4989-86d1-d2c2213b40cf")
    public static final String STEREOTYPE_NAME = "ApplicationMeasurement";

    /**
     * Tells whether a {@link ApplicationMeasurement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << ApplicationMeasurement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("6c852d0e-2da3-4ecc-815a-c26b4dd61580")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ApplicationMeasurement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << ApplicationMeasurement >> then instantiate a {@link ApplicationMeasurement} proxy.
     * 
     * @return a {@link ApplicationMeasurement} proxy on the created {@link Class}.
     */
    @objid ("647cf66e-5219-4623-92d4-897348268bc6")
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
    @objid ("06f0a326-7e2e-4881-bb93-2417762b8e17")
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
    @objid ("5e5f94b4-fda9-44d0-abd8-1491416227eb")
    public static ApplicationMeasurement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (ApplicationMeasurement.canInstantiate(obj))
        	return new ApplicationMeasurement(obj);
        else
        	throw new IllegalArgumentException("ApplicationMeasurement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a749e546-d085-44cd-95b6-1b5423af1427")
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
    @objid ("840e99d9-eeb9-4762-88d2-66fb0d387a07")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("4c65dd14-f5b7-40ed-b301-c1e08a162395")
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

    @objid ("cc0df318-7d6e-459d-b317-f928c51ddd2b")
    protected ApplicationMeasurement(final Class elt) {
        super(elt);
    }

    @objid ("c03973d2-687e-4c2b-b6af-b5fe5dfcf3e3")
    public static final class MdaTypes {
        @objid ("d117aa0d-4c96-4c79-9c91-4a4c1a5a47dd")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("292418c9-6be3-4c16-9e26-069985cef734")
        private static Stereotype MDAASSOCDEP;

        @objid ("ccdc97a8-044d-4780-a877-3ea83a3f5cf7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e64bea6d-fe6a-4cc9-ac67-936900a99020")
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
