/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/8/22 11:47 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.unitmodel.standard.datatype;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.UnitDimension;
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
 * Proxy class to handle a {@link DataType} with << DimensionedUnit >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("2e234a26-ab74-44b2-9156-be36441cff03")
public abstract class DimensionedUnit extends Unit {
    @objid ("ae177e45-c64e-4a23-8a6d-41e3871abb0f")
    public static final String STEREOTYPE_NAME = "DimensionedUnit";

    /**
     * Tells whether a {@link DimensionedUnit proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << DimensionedUnit >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("9fafbb62-3d6e-418e-a3ec-a12cbf83869b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DimensionedUnit.STEREOTYPE_NAME));
    }

    @objid ("ee8f24e5-8a55-491b-800b-d8bb4c7c81ac")
    public static DimensionedUnit instantiate(final DataType obj) {
        return SingleUnit.canInstantiate(obj) ?  new SingleUnit(obj) : CompositeUnit.canInstantiate(obj) ? new CompositeUnit(obj) : null;
    }

    @objid ("6171f53a-cf3e-41ab-963f-d49bf4ae5701")
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
        DimensionedUnit other = (DimensionedUnit) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value of the 'dimension' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("b4add8aa-0043-4935-b556-8e00f0381f8f")
    public UnitDimension getDimension() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(DimensionedUnit.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(DimensionedUnit.MdaTypes.MDAASSOCDEP_ROLE), "dimension")
                  && UnitDimension.canInstantiate(d.getDependsOn())) {
                     return (UnitDimension)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), UnitDimension.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the underlying {@link DataType}. 
     * @return the DataType represented by this proxy, never null.
     */
    @objid ("b15916f2-3b9e-4489-bf71-bd8eaa1b610b")
    @Override
    public DataType getElement() {
        return (DataType)super.getElement();
    }

    @objid ("d7c11e61-bb14-43fc-9c05-b80ebb100a26")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'dimension' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("0b2fd3a8-46ff-4e6f-bbef-3872fbe7ca6c")
    public void setDimension(final UnitDimension obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(DimensionedUnit.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(DimensionedUnit.MdaTypes.MDAASSOCDEP_ROLE), "dimension")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), DimensionedUnit.MdaTypes.MDAASSOCDEP);
              dep.setName("dimension");      dep.putTagValue(DimensionedUnit.MdaTypes.MDAASSOCDEP_ROLE, "dimension");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("ccf9a0d9-1bae-45a1-8cc4-078ff37e08f3")
    protected DimensionedUnit(final DataType elt) {
        super(elt);
    }

    @objid ("7020bdc9-61ca-45e7-b8b0-e04dd997a97d")
    public static final class MdaTypes {
        @objid ("c4a29dea-3d7b-4e5a-8c63-b5152a09b7ba")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("af680fff-913e-47e8-99e5-4846d9a5f0db")
        private static Stereotype MDAASSOCDEP;

        @objid ("8577dddc-e7f8-4a4d-b667-657bd28ca0f9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9d68369c-5d08-468a-b0b7-02f319388bc9")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "7e307b11-f18c-4c69-8c76-7b57b8d1bb8e");
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
