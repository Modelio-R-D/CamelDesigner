/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
 * Proxy class to handle a {@link Class} with << Schedule >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("98c5a57b-bbdd-4a3e-ab7c-6767c10ff2bd")
public class Schedule extends FeatureClass {
<<<<<<< HEAD
    @objid ("50996742-d044-4174-a41a-c7614619cebe")
    public static final String STEREOTYPE_NAME = "Schedule";

    @objid ("7fe0f5be-d687-46b1-9b3b-b12f2583a9c3")
    public static final String END_TAGTYPE = "end";

    @objid ("e23ab301-4429-47ad-80af-aad3e65337a4")
    public static final String INTERVAL_TAGTYPE = "interval";

    @objid ("7b23db1a-e25f-4bd0-8958-03f3329c1b43")
    public static final String REPETITIONS_TAGTYPE = "repetitions";

    @objid ("dbd79521-0660-4131-9ede-4a7017929fba")
=======
    @objid ("1faa56a4-1b94-401d-97ce-fd20cf3e602e")
    public static final String STEREOTYPE_NAME = "Schedule";

    @objid ("0aeee2d7-6194-48b0-bd56-b415311cfc22")
    public static final String END_TAGTYPE = "end";

    @objid ("f0002c19-ee55-4be4-9cff-e27a63bdb7d8")
    public static final String INTERVAL_TAGTYPE = "interval";

    @objid ("1041c73c-010e-445d-9a66-a901682b9a87")
    public static final String REPETITIONS_TAGTYPE = "repetitions";

    @objid ("70e33368-72cc-45fa-9aa3-923cd7af2ee7")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String START_TAGTYPE = "start";

    /**
     * Tells whether a {@link Schedule proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Schedule >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("ac773c05-90fe-4b43-ab4e-50302a65e7a8")
=======
    @objid ("b9fc2a7e-291a-465b-9a9e-3b33dee5e158")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Schedule.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Schedule >> then instantiate a {@link Schedule} proxy.
     * 
     * @return a {@link Schedule} proxy on the created {@link Class}.
     */
<<<<<<< HEAD
    @objid ("9e29baee-a0cb-4c0a-9ddc-5ce692855c57")
=======
    @objid ("d0d7ac60-707e-4dd1-a240-4b79e6a428bc")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static Schedule create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, Schedule.STEREOTYPE_NAME);
        return Schedule.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link Schedule} proxy from a {@link Class} stereotyped << Schedule >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link Schedule} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("f4c350d4-6c07-46a3-afa8-b1e2ce142bc4")
=======
    @objid ("3fa6cfc7-d8eb-4daa-ab78-c5fb7247c575")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static Schedule instantiate(final Class obj) {
        return Schedule.canInstantiate(obj) ? new Schedule(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Schedule} proxy from a {@link Class} stereotyped << Schedule >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link Schedule} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("0ee58e80-9127-48d4-8ebc-65a8c0e5ea8d")
=======
    @objid ("5efb07db-00c2-4570-ba2d-c0f848e11499")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static Schedule safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (Schedule.canInstantiate(obj))
        	return new Schedule(obj);
        else
        	throw new IllegalArgumentException("Schedule: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("bf1264cc-33e4-4e93-a8d3-1d9eec448d18")
=======
    @objid ("f4b33034-119f-40f4-b129-c635455318fb")
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
        Schedule other = (Schedule) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("80876b3e-8a94-4509-9a4f-c173bc8154b5")
=======
    @objid ("88ab792f-acc6-4d48-9396-bcf8df537413")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'end'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("053c3a02-e3ce-4641-b5ea-c7077e29008f")
=======
    @objid ("8a628168-96df-4210-b197-2de90ad5739c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getEnd() {
        return this.elt.getTagValue(Schedule.MdaTypes.END_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'interval'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("63343e94-d9b0-4ab4-8f45-95d74946e2d2")
=======
    @objid ("24a45322-c565-4272-93da-5f112f7e5a77")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getInterval() {
        return this.elt.getTagValue(Schedule.MdaTypes.INTERVAL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'repetitions'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("ad629778-479b-4deb-8d47-5f9d028f7fcb")
=======
    @objid ("99900436-9bd2-436b-ad46-9ed2469158b2")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getRepetitions() {
        return this.elt.getTagValue(Schedule.MdaTypes.REPETITIONS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'start'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("51ad21bf-b9c9-46e4-9753-e1354b99d464")
=======
    @objid ("f29dc438-39e5-48c8-93a0-b846a1baf088")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getStart() {
        return this.elt.getTagValue(Schedule.MdaTypes.START_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'timeUnit' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("968b076e-1a21-4dcb-a0c2-3499ab319b3c")
=======
    @objid ("640537c7-2c85-4c43-9a79-a172dc8b32d6")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public Unit getTimeUnit() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(Schedule.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(Schedule.MdaTypes.MDAASSOCDEP_ROLE), "timeUnit")){
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
    @objid ("9c378131-2e16-4600-9311-8301f0e13320")
=======
    @objid ("ad32c343-24ec-4915-b5e1-6fc36d6eaea9")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'end'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("fff654d6-51c3-41b7-8d43-edd2090519cc")
=======
    @objid ("1ee50b06-d7c3-4909-adf0-9a0a959add20")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setEnd(final String value) {
        this.elt.putTagValue(Schedule.MdaTypes.END_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'interval'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("3feb8b7d-11aa-4766-9efa-cdf409b62029")
=======
    @objid ("c1def3bf-6960-40d3-ac56-b6123027cc63")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setInterval(final String value) {
        this.elt.putTagValue(Schedule.MdaTypes.INTERVAL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'repetitions'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("b69f4bcc-87fa-40e4-a8cf-3e738c21536e")
=======
    @objid ("2bda1a09-700f-4b7c-8e45-c3bd51964189")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setRepetitions(final String value) {
        this.elt.putTagValue(Schedule.MdaTypes.REPETITIONS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'start'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("52c55c4b-42d7-4a00-aca5-920b935eaa2c")
=======
    @objid ("71bac73a-c6f3-4755-ad7f-1c6290bd83cc")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setStart(final String value) {
        this.elt.putTagValue(Schedule.MdaTypes.START_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'timeUnit' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("09f4a0c1-1f97-4784-afcf-906194277588")
=======
    @objid ("b3ffbdd9-b6f7-4577-9036-7001071b79f7")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setTimeUnit(final Unit obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(Schedule.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(Schedule.MdaTypes.MDAASSOCDEP_ROLE), "timeUnit")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), Schedule.MdaTypes.MDAASSOCDEP);
              dep.setName("timeUnit");      dep.putTagValue(Schedule.MdaTypes.MDAASSOCDEP_ROLE, "timeUnit");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("80ba0e9e-d2d3-4b58-9ead-c69e89ed0042")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

<<<<<<< HEAD
    @objid ("6ce91221-aaf8-4a94-b107-b1727cf35d84")
=======
    @objid ("b2d906f7-f5ea-47a3-81e1-310a1613c1a6")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected Schedule(final Class elt) {
        super(elt);
    }

    @objid ("0e156ba5-618a-44cd-8a09-9cb3cbf093ee")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("c71a6c32-899a-4104-a361-691eb29e4af9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("fdca0cf4-4008-4416-8bc1-6f2f7cf73342")
        public static TagType START_TAGTYPE_ELT;

        @objid ("19e1bb71-49b1-49ed-9810-a852a9d5e026")
        public static TagType END_TAGTYPE_ELT;

        @objid ("861db0fd-abba-4a9a-b044-b678f4d15f74")
        public static TagType REPETITIONS_TAGTYPE_ELT;

        @objid ("108a991d-16a4-42a8-942b-c72d13911cf6")
        public static TagType INTERVAL_TAGTYPE_ELT;

        @objid ("572f764c-a5ef-4b1a-9d64-7ea22d28ce95")
        private static Stereotype MDAASSOCDEP;

        @objid ("ca0a11ae-46d9-456f-8457-fa31ee80a8bb")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("00e38041-f443-4b9a-b7c0-f2d9000e340c")
=======
        @objid ("3ac47fe8-2420-49b2-a193-4c244312f301")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("477e031f-cc86-413b-bf39-e9209cb63b12")
        public static TagType START_TAGTYPE_ELT;

        @objid ("73cbcdfd-8858-4208-b3d7-26cf9aba791e")
        public static TagType END_TAGTYPE_ELT;

        @objid ("c816dcc4-59c4-4b2d-a095-034a161c8e98")
        public static TagType REPETITIONS_TAGTYPE_ELT;

        @objid ("326688c4-a68d-44f2-96b1-4a085cb20147")
        public static TagType INTERVAL_TAGTYPE_ELT;

        @objid ("467b9771-bb32-42b5-8635-4c8e58bb26ac")
        private static Stereotype MDAASSOCDEP;

        @objid ("254871be-f237-49db-9275-3ca739f2ba5c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3c0dcfe9-ea9a-43b1-acfc-0a61964d2ca7")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "cad43b0e-412b-4e89-9a37-e7e1cda6ca29");
            START_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "798817d7-1858-433c-924c-d2de04defbb5");
            END_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "508e2653-ea62-4c42-b280-044f60f4aa40");
            REPETITIONS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ce32b74c-7bc9-4e7a-8a99-2834143aec80");
            INTERVAL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "db3b563e-906f-40b7-a3f1-970e008bdf2a");
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
