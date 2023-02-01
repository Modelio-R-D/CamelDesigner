/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
 */
package fr.softeam.cameldesigner.api.unitmodel.standard.datatype;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
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
import org.modelio.metamodel.uml.statik.DataType;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link DataType} with << CompositeUnit >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("f5225f72-6f20-48b4-a955-1025a1e63d7c")
public class CompositeUnit extends DimensionedUnit {
<<<<<<< HEAD
    @objid ("411675f2-9be8-45ec-9ff1-50983d63f7f7")
    public static final String STEREOTYPE_NAME = "CompositeUnit";

    @objid ("1cbd460d-f45a-48e3-aff6-110da7007578")
=======
    @objid ("6812eeb8-b10d-4f35-a729-d9df2745dd36")
    public static final String STEREOTYPE_NAME = "CompositeUnit";

    @objid ("be4a91aa-9247-4ef0-a1a9-0b37cafd8a07")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String FORMULA_TAGTYPE = "formula";

    /**
     * Tells whether a {@link CompositeUnit proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << CompositeUnit >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("2fd95d05-b75b-407a-801d-5c58257dcda9")
=======
    @objid ("5d6ba260-c2b9-4aae-9ffa-14c57a3e5cfa")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CompositeUnit.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link DataType} stereotyped << CompositeUnit >> then instantiate a {@link CompositeUnit} proxy.
     * 
     * @return a {@link CompositeUnit} proxy on the created {@link DataType}.
     */
<<<<<<< HEAD
    @objid ("942a7aa0-531c-4b60-b28d-4945bc239847")
=======
    @objid ("966d111e-6869-4f89-8fa6-b9f14a5a60bb")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static CompositeUnit create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.DataType");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, CompositeUnit.STEREOTYPE_NAME);
        return CompositeUnit.instantiate((DataType)e);
    }

    /**
     * Tries to instantiate a {@link CompositeUnit} proxy from a {@link DataType} stereotyped << CompositeUnit >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a DataType
     * @return a {@link CompositeUnit} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("b1e95545-e19e-411e-a261-c1871f514ac3")
=======
    @objid ("0a9cfc3f-d61d-49ac-97d6-54a18d023b18")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static CompositeUnit instantiate(final DataType obj) {
        return CompositeUnit.canInstantiate(obj) ? new CompositeUnit(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CompositeUnit} proxy from a {@link DataType} stereotyped << CompositeUnit >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link DataType}
     * @return a {@link CompositeUnit} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("35e5456e-497f-4e79-9d84-4c60f024749e")
=======
    @objid ("2c2d2d2d-d79e-4229-86f4-f3a99fb9a947")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static CompositeUnit safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (CompositeUnit.canInstantiate(obj))
        	return new CompositeUnit(obj);
        else
        	throw new IllegalArgumentException("CompositeUnit: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'componentsUnits' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("31602cfd-2f1a-429b-b200-54547fddab1b")
=======
    @objid ("da5941ff-9796-4f4a-8fdc-cadd98196514")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addComponentsUnits(final Unit obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), CompositeUnit.MdaTypes.MDAASSOCDEP);
            d.setName("componentsUnits");
            d.putTagValue(CompositeUnit.MdaTypes.MDAASSOCDEP_ROLE, "componentsUnits");
        }
    }

<<<<<<< HEAD
    @objid ("6512b974-a07a-41a2-a5b4-ad7e6f9ca58d")
=======
    @objid ("02183d72-f641-4fd6-86ae-6fedafe730f8")
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
        CompositeUnit other = (CompositeUnit) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the values of the 'componentsUnits' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("60c0f2f0-fde2-4017-ac23-4be0df040ac4")
=======
    @objid ("37830106-28cb-46b8-a362-9fb117c9e551")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public List<Unit> getComponentsUnits() {
        List<Unit> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
           if (d.isStereotyped(CompositeUnit.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(CompositeUnit.MdaTypes.MDAASSOCDEP_ROLE), "componentsUnits")){
              if (SingleUnit.canInstantiate(d.getDependsOn()))
                results.add((SingleUnit)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SingleUnit.MdaTypes.STEREOTYPE_ELT.getName()));
              if (CompositeUnit.canInstantiate(d.getDependsOn()))
                results.add((CompositeUnit)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), CompositeUnit.MdaTypes.STEREOTYPE_ELT.getName()));
              if (Dimensionless.canInstantiate(d.getDependsOn()))
                results.add((Dimensionless)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Dimensionless.MdaTypes.STEREOTYPE_ELT.getName()));
           }
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link DataType}. 
     * @return the DataType represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("cdc9c40f-e44f-474a-aace-c53337198764")
=======
    @objid ("cba9e523-8850-4bca-bf1f-95f395ffe4b4")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public DataType getElement() {
        return (DataType)super.getElement();
    }

    /**
     * Getter for string property 'formula'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("45c26f11-7783-40f6-bd5c-323c77abf31f")
=======
    @objid ("61d5a023-30d2-45f3-9306-9ef70f052766")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getFormula() {
        return this.elt.getTagValue(CompositeUnit.MdaTypes.FORMULA_TAGTYPE_ELT);
    }

<<<<<<< HEAD
    @objid ("24fb5dd3-f301-4d67-a821-531933565d9d")
=======
    @objid ("8776d9e7-c11e-46a4-8021-8c5919fbe787")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'componentsUnits' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("d96a49ff-fa74-4525-85d9-4be1b0ff4201")
=======
    @objid ("82764375-aa04-4fd4-a17d-57c659f491f3")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeComponentsUnits(final Unit obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(CompositeUnit.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(CompositeUnit.MdaTypes.MDAASSOCDEP_ROLE), "componentsUnits")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Setter for string property 'formula'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("0a277951-ae68-4494-91a4-d5c116e2585e")
=======
    @objid ("c95b6fcf-f155-4f3b-8d89-30be3c84baa8")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setFormula(final String value) {
        this.elt.putTagValue(CompositeUnit.MdaTypes.FORMULA_TAGTYPE_ELT, value);
    }

    @objid ("76adb45a-b78f-4f0d-ac89-d402c9a0416d")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

<<<<<<< HEAD
    @objid ("831fdd34-a466-43c5-baf0-dbad57b487ce")
=======
    @objid ("36288a09-49aa-487b-8745-d4b7f255ecaf")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected CompositeUnit(final DataType elt) {
        super(elt);
    }

    @objid ("fb4ae2ef-3762-478f-83ef-6a6c6af48a4e")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("2a066153-8ce5-4fab-a95a-5dd0a8ee8dd1")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("dfd3953f-e72b-4605-baa1-55218b68a3c9")
        public static TagType FORMULA_TAGTYPE_ELT;

        @objid ("55526fed-6086-40ef-a2c0-1935682fa9a0")
        private static Stereotype MDAASSOCDEP;

        @objid ("949d14d5-de9b-432a-b926-99aa5369554c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5ea319c8-dd50-4916-a532-6b0058d876c0")
=======
        @objid ("33833bca-81b7-4942-bbe0-f3d8685c96d9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("122da9f7-4a01-4832-ad37-9188445e0ade")
        public static TagType FORMULA_TAGTYPE_ELT;

        @objid ("2790cfd7-08d4-4775-9291-70abbe2f54f6")
        private static Stereotype MDAASSOCDEP;

        @objid ("a4f3d38e-1e10-408b-8f59-582f82cddfec")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c2101291-3d96-4ade-9324-8d6961efc3dd")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "54731af6-c46a-4304-996c-2e03b9035567");
            FORMULA_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a2bb36cd-c4c0-4f75-b9ed-ec821fa8774e");
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
