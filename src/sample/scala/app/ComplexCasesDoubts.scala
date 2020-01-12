package sample.scala.app

object ComplexCasesDoubts {
  
  //1
//  final case class CreatedEvent(
//    eventId: String,
//    contractId: String,
//    templateId: Identifier,
//    createArguments: OfCid[V.ValueRecord],====??????
//    witnessParties: Set[String]
//) 
  
  //2
  ///  private val createdTemplateIdLens = ReqFieldLens.create[api.event.CreatedEvent, api.value.Identifier]('templateId)

  //3
//  
//    def convert: String \/ Event = apiEvent match {
//      case api.event.Event.Event.Archived(event) =>
//        s"Unexpected `Archived` event: $event. Only `Created` events are expected.".left
//      case api.event.Event.Event.Created(event) => event.convert
//      case api.event.Event.Event.Empty => "Unexpected `Empty` event.".left
//    }
  
  
  //4
//    private def convertRecord(apiRecord: api.value.Record) = {
//    for {
//      tycon <- apiRecord.recordId traverseU convertIdentifier map (_.flatten)
//      fields <- ImmArray(apiRecord.fields).traverseU(_.convert)
//    } yield V.ValueRecord(tycon, fields)
//  }
  
  
  
  
  //5
//  package object types {
//  type LedgerValue = Value[String]
//}
  
  //6*
  
//  object ReqFieldLens {
//  final class Create[C <: Product, V] {
//    def apply[K <: Symbol](
//        s: Witness.Aux[K]
//    )(
//        implicit mkFieldLens: MkFieldLens.Aux[C, K, Option[V]]
//    ): ReqFieldLens[C, V] = {
//      new ReqFieldLens[C, V](lens[C] >> s, s.value)
//    }
//  }
//
//  def create[C <: Product, V] = new Create[C, V]
//}

}