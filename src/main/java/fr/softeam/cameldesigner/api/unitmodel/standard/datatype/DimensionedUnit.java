/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.10

 * This file was generated on 4/27/22 11:51 AM by Modelio Studio.
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
    @objid ("2cb326a8-965a-478d-9a43-a217a285db8b")
    public static final String STEREOTYPE_NAME = "DimensionedUnit";

    /**
     * Tells whether a {@link DimensionedUnit proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << DimensionedUnit >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("0d764746-4ad8-457c-b1f4-b107119ae8c7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DimensionedUnit.STEREOTYPE_NAME));
    }

    @objid ("ee8f24e5-8a55-491b-800b-d8bb4c7c81ac")
    public static DimensionedUnit instantiate(final DataType obj) {
        return SingleUnit.canInstantiate(obj) ?  new SingleUnit(obj) : CompositeUnit.canInstantiate(obj) ? new CompositeUnit(obj) : null;
    }

    @objid ("fc6acc55-2941-4c5c-b5ff-86b4ed5b35d1")
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
    @objid ("ed21c615-82e8-44f3-8ea9-c9cf77df5ef5")
    public UnitDimension getDimension() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(DimensionedUnit.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(DimensionedUnit.MdaTypes.MDAASSOCDEP_ROLE), "dimension")){
                  if (UnitDimension.canInstantiate(d.getDependsOn()))
                     return (UnitDimension)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), UnitDimension.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the underlying {@link DataType}. 
     * @return the DataType represented by this proxy, never null.
     */
    @objid ("fd0543bc-054c-4158-886c-809e5b4a2048")
    @Override
    public DataType getElement() {
        return (DataType)super.getElement();
    }

    @objid ("a9ae8e13-8aaa-4924-9ffb-808e35ca4ff4")
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
    @objid ("3835c9c4-d0c4-4d5f-85ee-04b370020324")
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

    @objid ("8c46a634-4dbe-4247-89da-4418405e9c48")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("0069f519-ae28-4c76-9fa9-16f600cbe2f2")
    protected DimensionedUnit(final DataType elt) {
        super(elt);
    }

    @objid ("7020bdc9-61ca-45e7-b8b0-e04dd997a97d")
    public static final class MdaTypes {
        @objid ("8b002f9a-45f6-46fa-b448-689fd717f0c7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8c2af662-4f52-4a4a-8eef-5a8a7620c366")
        private static Stereotype MDAASSOCDEP;

        @objid ("2c057024-af34-4b81-b79c-d5c8633a1cbe")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e6f5f3b9-b4de-4a24-9c4d-e81cd742e5c6")
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
