/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.09

 * This file was generated on 4/20/22 10:37 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.metricmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.CompositeUnit;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.Dimensionless;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.SingleUnit;
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
    @objid ("d70f1563-dcc6-48a5-910c-7704cacf504f")
    public static final String STEREOTYPE_NAME = "Window";

    @objid ("a4109b5f-d91c-421a-bc46-6384618e3591")
    public static final String MEASUREMENTSIZE_TAGTYPE = "measurementSize";

    @objid ("c8abf10c-c471-4f62-b023-39655efb0462")
    public static final String SIZETYPE_TAGTYPE = "sizeType";

    @objid ("0de89e9a-927c-4e3b-84cc-d9889037d9da")
    public static final String TIMESIZE_TAGTYPE = "timeSize";

    @objid ("b441370e-852d-468d-aa3b-4c15be5a4402")
    public static final String WINDOWTYPE_TAGTYPE = "windowType";

    /**
     * Tells whether a {@link Window proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Window >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("7d9e4e9d-e939-47c3-9732-6ca0983bbb68")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Window.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Window >> then instantiate a {@link Window} proxy.
     * 
     * @return a {@link Window} proxy on the created {@link Class}.
     */
    @objid ("25dbe448-3395-4900-b325-1c779563308d")
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
    @objid ("a1209a97-5b5f-4419-992a-0e241c876a4d")
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
    @objid ("567f9dad-fb98-4536-92e7-4b4cebb70d63")
    public static Window safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (Window.canInstantiate(obj))
            return new Window(obj);
        else
            throw new IllegalArgumentException("Window: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ab388004-209a-4364-a51b-7d9bd9720e79")
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
    @objid ("0bf68ab9-c75f-4c66-9fde-01d1715411c4")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'measurementSize'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("4690194c-f853-4183-b090-c30e16939607")
    public String getMeasurementSize() {
        return this.elt.getTagValue(Window.MdaTypes.MEASUREMENTSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'sizeType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d3dd9e00-960c-45ef-b3fa-a6e5ba99858b")
    public String getSizeType() {
        return this.elt.getTagValue(Window.MdaTypes.SIZETYPE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'timeSize'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c3110bd6-c1a4-452e-80ca-32b5b2304cb2")
    public String getTimeSize() {
        return this.elt.getTagValue(Window.MdaTypes.TIMESIZE_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'timeUnit' role.<p>
     * Role description:
     * null
     */
    @objid ("68ed7b7d-f1fc-433e-a1a3-317f1cebf9b7")
    public Unit getTimeUnit() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(Window.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(Window.MdaTypes.MDAASSOCDEP_ROLE), "timeUnit")){
                  if (SingleUnit.canInstantiate(d.getDependsOn()))
                     return (SingleUnit)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SingleUnit.MdaTypes.STEREOTYPE_ELT.getName());
                  if (CompositeUnit.canInstantiate(d.getDependsOn()))
                     return (CompositeUnit)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), CompositeUnit.MdaTypes.STEREOTYPE_ELT.getName());
                  if (Dimensionless.canInstantiate(d.getDependsOn()))
                     return (Dimensionless)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Dimensionless.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Getter for string property 'windowType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("fd303364-2e0e-4606-99df-0bfdeb6e97e5")
    public String getWindowType() {
        return this.elt.getTagValue(Window.MdaTypes.WINDOWTYPE_TAGTYPE_ELT);
    }

    @objid ("f7282a2b-d93a-47b0-a8b6-bd5ad754ed64")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'measurementSize'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b6cbc3f3-fde9-46fd-890c-94d4f94787fd")
    public void setMeasurementSize(final String value) {
        this.elt.putTagValue(Window.MdaTypes.MEASUREMENTSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'sizeType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("56e9b71f-3917-409d-9daa-1a56d213a616")
    public void setSizeType(final String value) {
        this.elt.putTagValue(Window.MdaTypes.SIZETYPE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'timeSize'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0024ae2e-69c2-41ce-af01-d38a4f144588")
    public void setTimeSize(final String value) {
        this.elt.putTagValue(Window.MdaTypes.TIMESIZE_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'timeUnit' role.<p>
     * Role description:
     * null
     */
    @objid ("72f0af24-868c-40d9-825e-44c21d63974a")
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
    @objid ("12532d60-0d4d-4b0b-a125-f904db84a2ef")
    public void setWindowType(final String value) {
        this.elt.putTagValue(Window.MdaTypes.WINDOWTYPE_TAGTYPE_ELT, value);
    }

    @objid ("d4bc8486-c158-4e8b-a04b-b96dfbfa2206")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("010ef53a-69e3-486e-9d5f-3b93db3bcfcc")
    protected Window(final Class elt) {
        super(elt);
    }

    @objid ("0f238069-a54e-4f1f-ae34-e69145b5ddda")
    public static final class MdaTypes {
        @objid ("b22985db-7bdb-458b-b2c8-8f9cf5a7c402")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("01f40510-b2ca-4fa3-9d61-7062876a1bd1")
        public static TagType WINDOWTYPE_TAGTYPE_ELT;

        @objid ("fa296517-a3d9-4db9-ab62-5b9ca2d999a2")
        public static TagType SIZETYPE_TAGTYPE_ELT;

        @objid ("0e6ae1a6-5bfc-488e-9035-47507018472b")
        public static TagType MEASUREMENTSIZE_TAGTYPE_ELT;

        @objid ("756f5ed7-ab4a-4419-bc9b-fc5c00cb3d7f")
        public static TagType TIMESIZE_TAGTYPE_ELT;

        @objid ("183ae478-89e6-4700-aa4a-6a85529b528a")
        private static Stereotype MDAASSOCDEP;

        @objid ("1e2ee73b-e8b9-4a14-ac3b-093607922d97")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("04e77aa9-5dd4-4432-a7d1-e4d95ac73c8f")
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
