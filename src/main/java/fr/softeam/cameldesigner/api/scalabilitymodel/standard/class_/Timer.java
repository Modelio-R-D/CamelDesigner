/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
 */
package fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_;

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
 * Proxy class to handle a {@link Class} with << Timer >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("8cafa6ee-69cd-4fb1-a69e-ae3b71f7dd61")
public class Timer extends FeatureClass {
<<<<<<< HEAD
    @objid ("8703cec6-1130-4135-a680-53582f992178")
    public static final String STEREOTYPE_NAME = "Timer";

    @objid ("e9362cb5-56bc-4159-8503-d303e40d8c48")
    public static final String MAXOCCURRENCENUM_TAGTYPE = "maxOccurrenceNum";

    @objid ("a81ae38a-2dcc-4c10-a6ce-6493cee667aa")
    public static final String TIMEVALUE_TAGTYPE = "timeValue";

    @objid ("1a35a3a2-d2a2-425b-8714-a110c0ddf17c")
=======
    @objid ("315d0c59-e706-4b4c-b9cb-cde80c15520c")
    public static final String STEREOTYPE_NAME = "Timer";

    @objid ("a13917cb-9149-4fc5-bba8-9b43c047f7b5")
    public static final String MAXOCCURRENCENUM_TAGTYPE = "maxOccurrenceNum";

    @objid ("f899c95a-2023-4b34-a943-019dfc48af97")
    public static final String TIMEVALUE_TAGTYPE = "timeValue";

    @objid ("b3d34857-1d08-4c1a-8a73-0e50bfb9de8f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String TYPE_TAGTYPE = "type";

    /**
     * Tells whether a {@link Timer proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Timer >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("0d04dac5-8646-4e1d-83a1-9d06ef90e7ad")
=======
    @objid ("fa534bf1-29e7-47e6-ac70-4861f34c73a3")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Timer.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Timer >> then instantiate a {@link Timer} proxy.
     * 
     * @return a {@link Timer} proxy on the created {@link Class}.
     */
<<<<<<< HEAD
    @objid ("04b985bd-3253-44af-b740-4df7128c4e07")
=======
    @objid ("9164e587-afdf-424c-9285-f5fb1858b6d3")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static Timer create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, Timer.STEREOTYPE_NAME);
        return Timer.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link Timer} proxy from a {@link Class} stereotyped << Timer >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link Timer} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("6e8f28ca-ab1e-4b96-ba3c-9d145479d21f")
=======
    @objid ("bfeebd5f-6dc7-490e-b544-22bd0f615ab0")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static Timer instantiate(final Class obj) {
        return Timer.canInstantiate(obj) ? new Timer(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Timer} proxy from a {@link Class} stereotyped << Timer >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link Timer} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("1e801bde-1ce4-4d64-8458-bc5d6b8a5a75")
=======
    @objid ("e240e238-186c-4a75-9591-008033924e10")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static Timer safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (Timer.canInstantiate(obj))
        	return new Timer(obj);
        else
        	throw new IllegalArgumentException("Timer: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("3867246a-83ce-4f95-971b-56794b99474a")
=======
    @objid ("e8c72e33-76a2-47e9-a508-fd71a1053477")
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
        Timer other = (Timer) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("44f4b196-f820-4ca5-bffb-7bd20589ca4c")
=======
    @objid ("d6deb826-f782-4bba-8daa-855ebe80f874")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'maxOccurrenceNum'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("938ed39c-32b2-40e1-aa68-8ded4ba584a5")
=======
    @objid ("b29affb0-9f56-46be-9f7b-ce56af3b1ad8")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getMaxOccurrenceNum() {
        return this.elt.getTagValue(Timer.MdaTypes.MAXOCCURRENCENUM_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'timeValue'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("66e1b90b-a975-4222-a123-bb83ecd13a68")
=======
    @objid ("970a2155-f130-40a6-aadc-91c2b53195d1")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getTimeValue() {
        return this.elt.getTagValue(Timer.MdaTypes.TIMEVALUE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'type'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("d16d6440-bce1-40ce-8c89-177a9eb2e83f")
=======
    @objid ("b450281b-09d1-4361-906d-3238b56b57a6")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getType() {
        return this.elt.getTagValue(Timer.MdaTypes.TYPE_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'unit' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("679ea77c-868a-411b-a199-53bb343c1762")
=======
    @objid ("beda88bd-d2e5-4272-9842-0a42139ddeb6")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public Unit getUnit() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(Timer.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(Timer.MdaTypes.MDAASSOCDEP_ROLE), "unit")){
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

<<<<<<< HEAD
    @objid ("372afcb9-55e3-4c6d-8cf0-5659797e6039")
=======
    @objid ("152cc5ae-967d-4a5e-a28a-7936924d3fae")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'maxOccurrenceNum'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("3037c5af-369b-4476-8474-930bff4a4da4")
=======
    @objid ("37a4e875-7e33-487a-8504-503d54d9b04c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setMaxOccurrenceNum(final String value) {
        this.elt.putTagValue(Timer.MdaTypes.MAXOCCURRENCENUM_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'timeValue'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("8ef47766-6063-4e16-a6b3-04c3d0cc2a67")
=======
    @objid ("b9acfc04-54de-43ee-a306-36fa52b20031")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setTimeValue(final String value) {
        this.elt.putTagValue(Timer.MdaTypes.TIMEVALUE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'type'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("785be98a-550f-4dec-9f57-586633efcec4")
=======
    @objid ("5493f2a2-578e-4511-9217-07d290acb891")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setType(final String value) {
        this.elt.putTagValue(Timer.MdaTypes.TYPE_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'unit' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("3e79fe2d-7341-4e9d-82d8-3ea8763835d4")
=======
    @objid ("e4cc0475-70f5-4aa2-a725-1c1e080a443e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setUnit(final Unit obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(Timer.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(Timer.MdaTypes.MDAASSOCDEP_ROLE), "unit")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), Timer.MdaTypes.MDAASSOCDEP);
              dep.setName("unit");      dep.putTagValue(Timer.MdaTypes.MDAASSOCDEP_ROLE, "unit");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("15f73c69-1e3a-4b5a-b451-c937c69e6578")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

<<<<<<< HEAD
    @objid ("43e05419-889c-4204-89d1-fb709556dcf6")
=======
    @objid ("a36d07bb-62b8-4d76-bf70-d4187dd0bcf3")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected Timer(final Class elt) {
        super(elt);
    }

    @objid ("93fa2506-690b-41f3-a6df-8e0ad6afab5e")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("b8a98574-4b90-47c8-9c36-e88ab4b422f8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5e630c12-d0b9-4fd2-8e55-f2fa631bb135")
        public static TagType TYPE_TAGTYPE_ELT;

        @objid ("07d2c82c-b186-42fe-ae33-d418fff2ef6d")
        public static TagType TIMEVALUE_TAGTYPE_ELT;

        @objid ("593cf02e-5f3f-4271-bf97-a5dfd8975b63")
        public static TagType MAXOCCURRENCENUM_TAGTYPE_ELT;

        @objid ("bf26ee96-6b92-4c79-8edc-65f9118b04ef")
        private static Stereotype MDAASSOCDEP;

        @objid ("19743555-579a-469c-b9ba-06dbf3cf3172")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("10afcd71-f66f-4fcf-a3c1-19abe3bc298c")
=======
        @objid ("d949fb54-737e-4954-ada1-4df05d8491c9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("53e0b15f-14ba-4d71-ba59-0e9043a62c58")
        public static TagType TYPE_TAGTYPE_ELT;

        @objid ("e4a4ea67-9669-4ce4-89cf-8e96ad071dd4")
        public static TagType TIMEVALUE_TAGTYPE_ELT;

        @objid ("6168269b-3e26-4e3c-878b-b03c1c3d2bac")
        public static TagType MAXOCCURRENCENUM_TAGTYPE_ELT;

        @objid ("77f02033-9f18-4933-adb5-513e36bbe133")
        private static Stereotype MDAASSOCDEP;

        @objid ("856b67d2-0d1a-4312-931f-cd83990450b2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5c0e86c5-6c65-43cc-a973-ace9752168b0")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "ee279c12-3256-430d-b3f9-146318d3e947");
            TYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1442a037-e5a4-4248-bc4d-20d6cc5568e0");
            TIMEVALUE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4898fefb-c185-478e-b8cf-96025bfe5971");
            MAXOCCURRENCENUM_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "94fa8f95-4a9e-4209-b10c-b8c31176f9af");
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
