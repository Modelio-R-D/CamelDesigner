/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/16/22 10:46 AM by Modelio Studio.
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
    @objid ("a2469ffa-c1b6-4412-a28f-a1d9b852de22")
    public static final String STEREOTYPE_NAME = "ApplicationMeasurement";

    /**
     * Tells whether a {@link ApplicationMeasurement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << ApplicationMeasurement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("3ebc8acb-2b7a-4d53-b263-de573512fbf6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ApplicationMeasurement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << ApplicationMeasurement >> then instantiate a {@link ApplicationMeasurement} proxy.
     * 
     * @return a {@link ApplicationMeasurement} proxy on the created {@link Class}.
     */
    @objid ("91937011-6022-4394-a131-3bd15e541b22")
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
    @objid ("f706bcc8-21c6-4954-b11c-6c4ae5f5bb96")
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
    @objid ("92786bee-6fd6-406d-8822-7bdbdeae4886")
    public static ApplicationMeasurement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (ApplicationMeasurement.canInstantiate(obj))
        	return new ApplicationMeasurement(obj);
        else
        	throw new IllegalArgumentException("ApplicationMeasurement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3a1fae69-8fe6-46e1-b124-081803483093")
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
    @objid ("f1e7dc21-9f06-4f13-a4d6-2bafe2f473e6")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("80e0030e-8d34-4b00-95c0-84cb440395f1")
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

    @objid ("50090dc6-7649-443d-b555-e30b303a3702")
    protected ApplicationMeasurement(final Class elt) {
        super(elt);
    }

    @objid ("c03973d2-687e-4c2b-b6af-b5fe5dfcf3e3")
    public static final class MdaTypes {
        @objid ("8f882a39-2571-44db-b016-2dbc717765d6")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("dc797954-b915-431b-9f68-87c66e0ed505")
        private static Stereotype MDAASSOCDEP;

        @objid ("bf0dbeac-8580-4d74-b353-845b48853554")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("318bcb2c-b84d-41df-a168-7d59dd82afaf")
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
