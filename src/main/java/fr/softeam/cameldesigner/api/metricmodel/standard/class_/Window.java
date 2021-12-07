/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.05

 * This file was generated on 11/24/21 6:53 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.metricmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.Unit;
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
 * Proxy class to handle a {@link Class} with << Window >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("8bc634f0-656d-49d2-ba18-28050cd2f9dd")
public class Window extends FeatureClass {
    @objid ("fcb5f47f-b24c-4923-9890-f90d74d40366")
    public static final String STEREOTYPE_NAME = "Window";

    @objid ("7c44f692-433e-4859-800f-bdb75189ddb8")
    public static final String MEASUREMENTSIZE_TAGTYPE = "measurementSize";

    @objid ("133a9ac1-7d52-4b6f-9b4c-949e1130b93f")
    public static final String SIZETYPE_TAGTYPE = "sizeType";

    @objid ("d6ba6458-207b-4e1b-a3c5-1c92607631fd")
    public static final String TIMESIZE_TAGTYPE = "timeSize";

    @objid ("f1b8539a-5751-448e-af08-dfc649e1cc67")
    public static final String WINDOWTYPE_TAGTYPE = "windowType";

    /**
     * Tells whether a {@link Window proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Window >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("3aa10ed2-88f0-47cf-b0d2-8eaedcd73e34")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Window.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Window >> then instantiate a {@link Window} proxy.
     * 
     * @return a {@link Window} proxy on the created {@link Class}.
     */
    @objid ("089ddb38-5386-48f0-8075-6d8c59523f5d")
    public static Window create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, Window.STEREOTYPE_NAME);
        return Window.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link Window} proxy from a {@link Class} stereotyped << Window >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link Window} proxy or <i>null</i>.
     */
    @objid ("2f4de8b0-e55a-4d90-bcfc-5be1e06043aa")
    public static Window instantiate(final Class obj) {
        return Window.canInstantiate(obj) ? new Window(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Window} proxy from a {@link Class} stereotyped << Window >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link Window} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("73ad82ce-5a82-42dc-a756-4318219fbf3e")
    public static Window safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (Window.canInstantiate(obj))
            return new Window(obj);
        else
            throw new IllegalArgumentException("Window: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("824ebaed-1ab6-4267-bd81-dfa3da20f5c9")
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
        Window other = (Window) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}.
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("20188999-5719-445b-866b-fabb62aa228c")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'measurementSize'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("01862bf1-1652-477a-8398-489989d2c698")
    public String getMeasurementSize() {
        return this.elt.getTagValue(Window.MdaTypes.MEASUREMENTSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'sizeType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("fe641ac6-6026-41c0-b21b-462ffa145229")
    public String getSizeType() {
        return this.elt.getTagValue(Window.MdaTypes.SIZETYPE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'timeSize'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("54e493ca-a658-4ce3-bc8c-35ae0c1986aa")
    public String getTimeSize() {
        return this.elt.getTagValue(Window.MdaTypes.TIMESIZE_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'timeUnit' role.<p>
     * Role description:
     * null
     */
    @objid ("2dda57bc-cdf0-4527-9f1c-d7e4457132e8")
    public Unit getTimeUnit() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(Window.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(Window.MdaTypes.MDAASSOCDEP_ROLE), "timeUnit")
                  && Unit.canInstantiate(d.getDependsOn())) {
                     return (Unit)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Unit.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Getter for string property 'windowType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7e577d4d-70c7-469c-ad0d-47a6833e3392")
    public String getWindowType() {
        return this.elt.getTagValue(Window.MdaTypes.WINDOWTYPE_TAGTYPE_ELT);
    }

    @objid ("2ffb2b52-e5b0-49dd-b308-9ead776c803f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'measurementSize'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6b79a0bd-b937-42fa-8071-bd4f5a43951a")
    public void setMeasurementSize(final String value) {
        this.elt.putTagValue(Window.MdaTypes.MEASUREMENTSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'sizeType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ec107d99-b02c-4d22-a46e-fb0c637f7572")
    public void setSizeType(final String value) {
        this.elt.putTagValue(Window.MdaTypes.SIZETYPE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'timeSize'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("1c43aa86-43b0-4135-b1e5-517c26cf1951")
    public void setTimeSize(final String value) {
        this.elt.putTagValue(Window.MdaTypes.TIMESIZE_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'timeUnit' role.<p>
     * Role description:
     * null
     */
    @objid ("c23ff67b-2bc6-4806-8d41-a062ba22e235")
    public void setTimeUnit(final Unit obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(Window.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(Window.MdaTypes.MDAASSOCDEP_ROLE), "timeUnit")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), Window.MdaTypes.MDAASSOCDEP);
              dep.setName("timeUnit");      dep.putTagValue(Window.MdaTypes.MDAASSOCDEP_ROLE, "timeUnit");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Setter for string property 'windowType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e944a73b-80e7-49af-a83f-7f0fae4f9020")
    public void setWindowType(final String value) {
        this.elt.putTagValue(Window.MdaTypes.WINDOWTYPE_TAGTYPE_ELT, value);
    }

    @objid ("e828adb9-2db9-4c38-a32f-b4babb3e3194")
    protected Window(final Class elt) {
        super(elt);
    }

    @objid ("0f238069-a54e-4f1f-ae34-e69145b5ddda")
    public static final class MdaTypes {
        @objid ("293cb5d1-4de4-48ec-a1ac-8f398e7e8c0e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3c0c4217-5365-4f8d-9030-b8c5d0960b2f")
        public static TagType WINDOWTYPE_TAGTYPE_ELT;

        @objid ("04a9c77d-77f7-4cc8-8722-8fbe9012d21e")
        public static TagType SIZETYPE_TAGTYPE_ELT;

        @objid ("0595c4ff-f5b6-4e0f-b032-369a6933e6d1")
        public static TagType MEASUREMENTSIZE_TAGTYPE_ELT;

        @objid ("93177571-659a-4a35-ae5f-bbfbec988e82")
        public static TagType TIMESIZE_TAGTYPE_ELT;

        @objid ("3feb7752-75d5-4fbe-9b68-ae28cc59a72f")
        private static Stereotype MDAASSOCDEP;

        @objid ("128e24ae-80e9-481a-a413-eda5101f77ad")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7f1d074b-4f92-40fc-b7b7-3c79088f55d1")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "33bb8dc7-688c-4f64-97da-a3fcddbddc20");
            WINDOWTYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cd7ae4c0-9f79-4384-b562-1bfdfa78754a");
            SIZETYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9c7e3aaf-1ae0-4766-b44d-2717c3abea43");
            MEASUREMENTSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "651305db-6f84-43d4-ba59-fbc3a00368d0");
            TIMESIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "7ab2f3bb-742a-4b32-b5f9-08576f164c8b");
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
