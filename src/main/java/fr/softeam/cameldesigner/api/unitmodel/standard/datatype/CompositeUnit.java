/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 3/17/22 5:18 PM by Modelio Studio.
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
    @objid ("c2c6aeec-883b-4e00-9f86-813284ba9909")
    public static final String STEREOTYPE_NAME = "CompositeUnit";

    @objid ("4f059280-f5a6-4c09-a003-5baad7d6fa94")
    public static final String FORMULA_TAGTYPE = "formula";

    /**
     * Tells whether a {@link CompositeUnit proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << CompositeUnit >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e801ca92-91e9-4da2-ab3f-f500e0909a00")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CompositeUnit.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link DataType} stereotyped << CompositeUnit >> then instantiate a {@link CompositeUnit} proxy.
     * 
     * @return a {@link CompositeUnit} proxy on the created {@link DataType}.
     */
    @objid ("8c7b0c96-4960-4c5d-ba29-156fab3d882c")
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
    @objid ("4f86889a-62b2-4a3d-a378-5bf662be1714")
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
    @objid ("82925ffd-b39b-44c7-bf13-89ea8ab7e0e3")
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
    @objid ("6b723a9f-4187-4845-ad5b-da582dcb5df1")
    public void addComponentsUnits(final Unit obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), CompositeUnit.MdaTypes.MDAASSOCDEP);
            d.setName("componentsUnits");
            d.putTagValue(CompositeUnit.MdaTypes.MDAASSOCDEP_ROLE, "componentsUnits");
        }
    }

    @objid ("d2345b5f-08f1-4290-b2d9-baad4c86ea9e")
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
    @objid ("9028ac6c-e05e-48f6-b038-e5f8a6f8c0c3")
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
    @objid ("c16f65be-6ef8-4b53-b85e-0bb01c4a3124")
    @Override
    public DataType getElement() {
        return (DataType)super.getElement();
    }

    /**
     * Getter for string property 'formula'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("4b8daf53-7291-4460-9fba-4c76ba182998")
    public String getFormula() {
        return this.elt.getTagValue(CompositeUnit.MdaTypes.FORMULA_TAGTYPE_ELT);
    }

    @objid ("b45493dc-4044-4018-9699-23e9cce46430")
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
    @objid ("c7f4b871-c7c5-4b15-803f-da4b40f34c68")
    public boolean removeComponentsUnits(final Unit obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(CompositeUnit.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(CompositeUnit.MdaTypes.MDAASSOCDEP_ROLE), "")) 
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
    @objid ("43edb6fe-9a8c-493a-9d65-0aaf6e2b717f")
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

    @objid ("c895f511-0355-4a10-b61f-58d5c2416cfb")
    protected CompositeUnit(final DataType elt) {
        super(elt);
    }

    @objid ("fb4ae2ef-3762-478f-83ef-6a6c6af48a4e")
    public static final class MdaTypes {
        @objid ("a46fe112-3950-41b4-881d-a406a476000b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("32e019cd-b520-4d5b-9507-24065fb14103")
        public static TagType FORMULA_TAGTYPE_ELT;

        @objid ("5984ae55-0913-41a8-b054-af3c566874e9")
        private static Stereotype MDAASSOCDEP;

        @objid ("8566fbd2-0d7b-4fe3-8d8d-709484d8e4e0")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("82be1c8b-550b-428c-a0e0-7cefe6a02a12")
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
