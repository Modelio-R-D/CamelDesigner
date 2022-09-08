/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
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
    @objid ("be170c5b-cf7a-4e7a-9a5d-56183dbcb546")
    public static final String STEREOTYPE_NAME = "ApplicationMeasurement";

    /**
     * Tells whether a {@link ApplicationMeasurement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << ApplicationMeasurement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e5d71926-3851-4843-89a9-2f190e6ab1f0")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ApplicationMeasurement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << ApplicationMeasurement >> then instantiate a {@link ApplicationMeasurement} proxy.
     * 
     * @return a {@link ApplicationMeasurement} proxy on the created {@link Class}.
     */
    @objid ("2e4eae35-162f-4365-8262-54ecd4cce366")
    public static ApplicationMeasurement create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, ApplicationMeasurement.STEREOTYPE_NAME);
        return ApplicationMeasurement.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link ApplicationMeasurement} proxy from a {@link Class} stereotyped << ApplicationMeasurement >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link ApplicationMeasurement} proxy or <i>null</i>.
     */
    @objid ("2ca569ac-a5c7-41b7-94af-8d4068a993b1")
    public static ApplicationMeasurement instantiate(final Class obj) {
        return ApplicationMeasurement.canInstantiate(obj) ? new ApplicationMeasurement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ApplicationMeasurement} proxy from a {@link Class} stereotyped << ApplicationMeasurement >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link ApplicationMeasurement} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("b6822219-cd22-4c31-a0d8-6ad23aae1579")
    public static ApplicationMeasurement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (ApplicationMeasurement.canInstantiate(obj))
            return new ApplicationMeasurement(obj);
        else
            throw new IllegalArgumentException("ApplicationMeasurement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("33cc9c81-dde9-44bb-bb0d-e0acef1ea8de")
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
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("187ffb70-b2c9-4e31-97ca-3b6c41662f4b")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("33cacf19-6846-42dc-a5f6-0afacc821276")
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

    @objid ("b182ef27-2839-4d10-bba1-2e0dcd9b2202")
    protected ApplicationMeasurement(final Class elt) {
        super(elt);
    }

    @objid ("c03973d2-687e-4c2b-b6af-b5fe5dfcf3e3")
    public static final class MdaTypes {
        @objid ("5b4a8368-b389-4483-8a2d-13140ded13b7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3be27e9e-9c17-4c50-95c7-3a1c66a5de80")
        private static Stereotype MDAASSOCDEP;

        @objid ("72294103-b1bb-4a6b-a1a2-e39efb962931")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("10639bfe-f8c4-4bd0-b7e2-5afb75dcfb90")
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
