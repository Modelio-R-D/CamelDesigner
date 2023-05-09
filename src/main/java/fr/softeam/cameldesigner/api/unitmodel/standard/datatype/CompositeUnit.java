/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/16/23 3:21 PM by Modelio Studio.
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
    @objid ("e397ed27-8bc8-4ab9-8736-971218baa43e")
    public static final String STEREOTYPE_NAME = "CompositeUnit";

    @objid ("32ebf8fb-f23a-452e-9d5f-a76c6fdb5235")
    public static final String FORMULA_TAGTYPE = "formula";

    /**
     * Tells whether a {@link CompositeUnit proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << CompositeUnit >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("755094f1-20ca-4397-b597-cb4f8393364b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CompositeUnit.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link DataType} stereotyped << CompositeUnit >> then instantiate a {@link CompositeUnit} proxy.
     * 
     * @return a {@link CompositeUnit} proxy on the created {@link DataType}.
     */
    @objid ("48c1b4c8-ebf3-4902-bfdc-8d2e9579aceb")
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
    @objid ("c008bce8-5454-4483-8b71-7d47cf2bf86b")
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
    @objid ("11757e29-6a3f-43b6-b7ba-d772bbb6c395")
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
    @objid ("cd4a4b3a-92b1-4dda-90de-7e55741cdd6d")
    public void addComponentsUnits(final Unit obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), CompositeUnit.MdaTypes.MDAASSOCDEP);
            d.setName("componentsUnits");
            d.putTagValue(CompositeUnit.MdaTypes.MDAASSOCDEP_ROLE, "componentsUnits");
        }
    }

    @objid ("85c20eb4-56bc-4797-9750-d7d7a37e64c3")
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
    @objid ("66635c9d-dc92-4f20-a32f-8d0240af9314")
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
    @objid ("2e330ec5-7e77-4f61-8121-867bd20d4c88")
    @Override
    public DataType getElement() {
        return (DataType)super.getElement();
    }

    /**
     * Getter for string property 'formula'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("064a7c4f-b906-44aa-a90e-c948c6b2b035")
    public String getFormula() {
        return this.elt.getTagValue(CompositeUnit.MdaTypes.FORMULA_TAGTYPE_ELT);
    }

    @objid ("fd34c960-7b24-473b-84d3-84607ed5d87e")
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
    @objid ("adaa38e7-eb3f-4c30-992c-0f5958148e2a")
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
    @objid ("67012087-d0b8-4ae6-b171-a1926ff87b8f")
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

    @objid ("96ce6893-70db-49e1-a500-c0e1eec70d5a")
    protected CompositeUnit(final DataType elt) {
        super(elt);
    }

    @objid ("fb4ae2ef-3762-478f-83ef-6a6c6af48a4e")
    public static final class MdaTypes {
        @objid ("3202ea60-2974-403c-9553-c9ac3ec4deed")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a167ed32-cae4-4299-a60c-92932030cfbb")
        public static TagType FORMULA_TAGTYPE_ELT;

        @objid ("89f2d07a-8bce-4bab-af0e-d93f0bb922d9")
        private static Stereotype MDAASSOCDEP;

        @objid ("f2680e3c-4edf-4398-82e6-e75039fcc2a8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("495dbcc2-f68a-4ba8-a700-c453c8bc1572")
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
