/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("452fb293-7794-438e-9a0c-a7ac60552148")
=======
    @objid ("95330211-9a82-4387-85ec-2340c91db605")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "ApplicationMeasurement";

    /**
     * Tells whether a {@link ApplicationMeasurement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << ApplicationMeasurement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("73448fc2-83db-4450-84fd-7927e984aa9f")
=======
    @objid ("dcc6d216-9d93-4823-9443-0e713c64bbfb")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ApplicationMeasurement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << ApplicationMeasurement >> then instantiate a {@link ApplicationMeasurement} proxy.
     * 
     * @return a {@link ApplicationMeasurement} proxy on the created {@link Class}.
     */
<<<<<<< HEAD
    @objid ("64c754e1-d87e-426f-a9c5-f01715ba1fd7")
=======
    @objid ("2f5db6e0-736d-4237-99fe-7c77a6ca4d46")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("43159a19-2619-4429-bae8-4f4675fa6a3b")
=======
    @objid ("9726bd0e-c5ae-4b57-b2e9-c97973ac8c86")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("1b07ec45-ce61-457d-9c1c-55e3a727043d")
=======
    @objid ("3044c115-36d0-43ce-ac7f-7844dda06266")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static ApplicationMeasurement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (ApplicationMeasurement.canInstantiate(obj))
        	return new ApplicationMeasurement(obj);
        else
        	throw new IllegalArgumentException("ApplicationMeasurement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("036abf5c-e87b-4a3b-8ad6-8597ea36fee3")
=======
    @objid ("298032f3-ee70-4b23-a884-ba21b0f42cf6")
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
        ApplicationMeasurement other = (ApplicationMeasurement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("b271e1e4-b3a6-429a-8df6-f1990cf9ba2f")
=======
    @objid ("846af5f7-3446-4f6d-9beb-a3def159c78e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

<<<<<<< HEAD
    @objid ("60178589-dfdd-4129-826d-404771fc8f07")
=======
    @objid ("afafe367-9e38-4a4f-a07c-03cf95da120c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("2fd28bdf-4242-48c5-9a5d-a7b9fa8ecfd7")
=======
    @objid ("9e933c31-bd15-4a0a-88fb-f97f04af2cf1")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected ApplicationMeasurement(final Class elt) {
        super(elt);
    }

    @objid ("c03973d2-687e-4c2b-b6af-b5fe5dfcf3e3")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("5ab5bcab-d6cc-4968-8159-bea1cf287854")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("94497f31-1d89-48e0-8251-020525dff15b")
        private static Stereotype MDAASSOCDEP;

        @objid ("1e303211-7f39-4697-828c-d072da0b1235")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("faa2634d-a956-4142-95cc-870c59f37f16")
=======
        @objid ("2a7b6069-a276-4faf-98e7-2a7951b58006")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9a9fe55c-7b8e-4b76-857b-dbbc7ead2551")
        private static Stereotype MDAASSOCDEP;

        @objid ("942ee771-7ff5-4f12-9e49-c0599568465d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("26e8480a-77aa-4bfa-baf7-5dfd02ae56aa")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
